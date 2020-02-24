import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UiTestsCases {
    @Test
    public void opensite() {
        String exePath = "E:\\Drivers\\chrome\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.youtube.com/");

    }
}

