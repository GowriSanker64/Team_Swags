package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;

import browserFactory.setBrowser;

public class LoginSteps {

     WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Set up ChromeDriver using WebDriverManager (recommended)
        // io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();

        // System.setProperty("webdriver.edge.driver", "C:\\Tools\\EdgeDriver\\msedgedriver.exe");
        // driver = new EdgeDriver();\

        driver = setBrowser.setbrowser("chrome");

        // Open the login page
        driver.get("https://www.saucedemo.com/");

        // Optional: maximize window
        driver.manage().window().maximize();
    }

    @When("user enters {string} and {string}")
    public void user_enters_valid_credentials(String username,String pass) {
        System.out.println("Simulating credential entry...");
        // You can add driver.findElement(...) here later
        // String username = "stdard_user";
        // String pass = "secret_sauce";
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys(pass);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        
    }

    @Then("user is redirected to the homepage")
    public void user_is_redirected_to_the_homepage() {
        String expectedDashBoardUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        if(expectedDashBoardUrl.equalsIgnoreCase(actualUrl)){
            System.out.println("Valid Credentials\n User login successfully");
            System.out.println("Simulating redirection...");
        }
        else{
            System.out.println("Invalid credentials");
        }
        
        driver.quit(); // Close browser
    }
}
