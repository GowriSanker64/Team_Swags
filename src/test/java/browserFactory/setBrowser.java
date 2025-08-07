package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setBrowser {
    public static WebDriver setbrowser(String browsername){
        WebDriver driver;
        if(browsername.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "C:\\Tools\\EdgeDriver\\msedgedriver.exe");
            driver = new EdgeDriver();
            return driver;
        }
        else{
            System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium\\chromedriver.exe");
            return new ChromeDriver();
        }
    }
}
