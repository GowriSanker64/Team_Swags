import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
    
private  Properties properties;

    public Configreader() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ajith-m\\Downloads\\CucumberJUnitProject\\src\\test\\resources\\config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void setProperty(String key,String value){
        this.properties.setProperty(key, value);
    }

    public  String getProperty(String key) {
        return properties.getProperty(key);
    }


}
