package demo.workship.mobile.config;

import demo.workship.mobile.models.binding.register.UserRegisterBindingModel;
import demo.workship.mobile.models.binding.register.UserRolesRegisterBindingModel;
import demo.workship.mobile.models.entities.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        PropertyMap<UserRegisterBindingModel, User> userMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setFirstName(source.getFirstName());
                map().setLastName(source.getLastName());
                map().setUsername(source.getUsername());
                map().setPassword(source.getPassword());

            }
        };
        return new ModelMapper();
    }
}
