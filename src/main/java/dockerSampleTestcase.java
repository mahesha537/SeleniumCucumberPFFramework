import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class dockerSampleTestcase {
    WebDriver driver;
    @Test
    public void testApp() throws IOException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"),cap);

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Chaithu");
        Thread.sleep(10000);
        FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),new File("target\\Reports\\screenshots\\ss-1.jpg"));
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
