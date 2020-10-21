package photoapp.api.users.photoapp.api.users.model;

public class LoginRequestModel {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("LoginRequestModel{email='%s', password='%s'}", email, password);
    }
}
