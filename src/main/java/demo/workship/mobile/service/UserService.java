package demo.workship.mobile.service;

import demo.workship.mobile.models.binding.register.UserRegisterBindingModel;

public interface UserService {

    void register(UserRegisterBindingModel userRegisterBindingModel);
    void login(String username, String password);
}
