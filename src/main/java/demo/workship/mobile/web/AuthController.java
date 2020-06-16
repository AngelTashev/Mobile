package demo.workship.mobile.web;

import demo.workship.mobile.models.binding.register.UserRegisterBindingModel;
import demo.workship.mobile.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class AuthController {

    private final UserService userService;

    private final ModelMapper modelMapper;

    @Autowired
    public AuthController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    // Register mapping

    @GetMapping("/register")
    public String getRegisterForm(@ModelAttribute("user") UserRegisterBindingModel userRegisterBindingModel) {
        return "auth-register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserRegisterBindingModel userRegisterBindingModel) {
        try {
            this.userService.register(userRegisterBindingModel);
        } catch (IllegalArgumentException e) {
            return "redirect:/users/register";
        }
        return "redirect:/users/login";
    }

    // Login mapping

    @GetMapping("/login")
    public String getLoginForm() {
        return "auth-login";
    }

}
