package demo.workship.mobile.service.impl;

import demo.workship.mobile.models.binding.register.UserRegisterBindingModel;
import demo.workship.mobile.models.entities.User;
import demo.workship.mobile.models.entities.UserRole;
import demo.workship.mobile.models.entities.enums.Role;
import demo.workship.mobile.repository.UserRepository;
import demo.workship.mobile.service.UserService;
import org.apache.tomcat.jni.Time;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final ModelMapper modelMapper;

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public void register(UserRegisterBindingModel userRegisterBindingModel) {
        if (this.userRepository.getUserByUsername(userRegisterBindingModel.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username is already taken");
        }
        User user = this.modelMapper.map(userRegisterBindingModel, User.class);
        // Set roles
        Set<UserRole> roles = new HashSet<>();
        for (String role : userRegisterBindingModel.getRoles()) {
            UserRole userRole = new UserRole();
            userRole.setRole(Role.valueOf(role));
            roles.add(userRole);
        }
        user.setRoles(roles);
        user.setActive(false);
        user.setCreated(LocalDateTime.now());
        user.setModified(user.getCreated());
        this.userRepository.save(user);
    }

    @Override
    public void login(String username, String password) {

    }
}
