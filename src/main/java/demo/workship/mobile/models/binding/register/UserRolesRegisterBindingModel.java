package demo.workship.mobile.models.binding.register;

import demo.workship.mobile.models.entities.enums.Role;

import javax.validation.constraints.NotNull;

public class UserRolesRegisterBindingModel {

    private Role role;

    public UserRolesRegisterBindingModel() {
    }

    @NotNull
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
