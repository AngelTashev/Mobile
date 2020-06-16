package demo.workship.mobile.config;

import demo.workship.mobile.models.binding.register.UserRegisterBindingModel;
import demo.workship.mobile.models.entities.User;
import demo.workship.mobile.models.entities.UserRole;
import demo.workship.mobile.models.entities.enums.Role;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
