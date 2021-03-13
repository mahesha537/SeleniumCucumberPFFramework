import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridStandalone {
    WebDriver driver;
    @BeforeTest
            public void setup() throws MalformedURLException {
//      Setting up Desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);

        //Defining ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(cap);
//      Setting up hub url
        String hubUrl = "http://172.19.176.1:4445/wd/hub";
        driver = new RemoteWebDriver(new URL(hubUrl),chromeOptions);
        driver.get("http://www.google.com");
    }
    @Test
    public void firstTest(){
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void TearDown(){
        driver.quit();
    }

}
