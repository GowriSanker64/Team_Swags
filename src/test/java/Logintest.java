public class Logintest {
    
public static void main(String[] args) {
        Configreader config = new Configreader();

        String url = config.getProperty("url");
        String username = config.getProperty("username");
        String password = config.getProperty("password");


        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        config.setProperty(username, "Ajith@123");
        System.out.println(config.getProperty(username));
    }

    
}
