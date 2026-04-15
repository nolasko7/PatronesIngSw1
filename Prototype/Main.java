package Prototype;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Config base (costosa de crear)
        UserConfig baseConfig = new UserConfig(
                "default",
                "dark",
                new java.util.ArrayList<>(Arrays.asList("READ", "WRITE"))
        );

        // Clonamos en lugar de crear desde cero
        UserConfig user1 = baseConfig.clone();
        user1.setUsername("valentin");

        UserConfig user2 = baseConfig.clone();
        user2.setUsername("martina");
        user2.addPermission("ADMIN");

        System.out.println(baseConfig);
        System.out.println(user1);
        System.out.println(user2);
    }
}