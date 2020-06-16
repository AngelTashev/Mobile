package demo.workship.mobile.models.binding.register;

import demo.workship.mobile.models.entities.UserRole;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class UserRegisterBindingModel {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Set<UserRolesRegisterBindingModel> roles;

    public UserRegisterBindingModel() {
    }

    @NotNull
    @Length(min = 3, max = 20, message = "First name must be between 3 and 20 characters")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    @Length(min = 3, max = 20, message = "Last name must be between 3 and 20 characters")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @NotNull
    @Length(min = 5, max = 20, message = "Username must be between 5 and 20 characters")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @Length(min = 8, max = 30, message = "Password must be between 8 and 30 characters")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    public Set<UserRolesRegisterBindingModel> getRoles() {
        return roles;
    }

    public void setRoles(Set<UserRolesRegisterBindingModel> roles) {
        this.roles = roles;
    }
}
