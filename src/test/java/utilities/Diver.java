package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Diver {

    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://www.google.com");

    }
}
