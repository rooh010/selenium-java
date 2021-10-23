import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");

        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("webdriver.chrome.driver"));

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://www.github.com");
        driver.quit();

    }
}
