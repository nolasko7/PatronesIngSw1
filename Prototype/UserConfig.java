package Prototype;
import java.util.ArrayList;
import java.util.List;

public class UserConfig implements Prototype<UserConfig> {

    private String username;
    private String theme;
    private List<String> permissions;

    public UserConfig(String username, String theme, List<String> permissions) {
        this.username = username;
        this.theme = theme;
        this.permissions = permissions;
    }

    // Constructor de copia (clave para Prototype)
    public UserConfig(UserConfig target) {
        this.username = target.username;
        this.theme = target.theme;
        this.permissions = new ArrayList<>(target.permissions); // copia profunda
    }

    @Override
    public UserConfig clone() {
        return new UserConfig(this);
    }

    // setters y getters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void addPermission(String permission) {
        this.permissions.add(permission);
    }

    @Override
    public String toString() {
        return "UserConfig{" +
                "username='" + username + '\'' +
                ", theme='" + theme + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}