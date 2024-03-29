import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class TestImplementation {

    private WebDriver driver;
    @Test
    public void verifyGitHubTitle() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.github.com");
        assertThat(driver.getTitle(), containsString("GitHub"));
    }
}