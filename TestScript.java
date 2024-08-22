// import io.appium.java_client.AppiumDriver;
// import io.appium.java_client.MobileElement;
// import io.appium.java_client.android.AndroidDriver;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestScript {

    public static void main(String[] args) {
        System.out.println("null");
    //     WebDriver driver = null;
    //     AppiumDriver<MobileElement> appiumDriver = null;

    //     try {
    //         // Set up Selenium Grid (web test)
    //         DesiredCapabilities capabilities = new DesiredCapabilities();
    //         capabilities.setBrowserName("chrome");
    //         driver = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), capabilities);

    //         // Open a website
    //         driver.get("http://www.example.com");
    //         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //         // Perform a simple interaction
    //         WebElement element = driver.findElement(By.tagName("h1"));
    //         System.out.println("Page title: " + element.getText());

    //         // Set up Appium (mobile test)
    //         DesiredCapabilities appiumCapabilities = new DesiredCapabilities();
    //         appiumCapabilities.setCapability("platformName", "Android");
    //         appiumCapabilities.setCapability("deviceName", "emulator-5554");
    //         appiumCapabilities.setCapability("appPackage", "com.android.calculator2");
    //         appiumCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

    //         appiumDriver = new AndroidDriver<MobileElement>(new URL("http://appium:4723/wd/hub"), appiumCapabilities);
    //         appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //         // Perform a simple interaction with the calculator app
    //         MobileElement digit2 = appiumDriver.findElement(By.id("com.android.calculator2:id/digit_2"));
    //         MobileElement plus = appiumDriver.findElement(By.id("com.android.calculator2:id/op_add"));
    //         MobileElement digit3 = appiumDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
    //         MobileElement equals = appiumDriver.findElement(By.id("com.android.calculator2:id/eq"));

    //         digit2.click();
    //         plus.click();
    //         digit3.click();
    //         equals.click();

    //         MobileElement result = appiumDriver.findElement(By.id("com.android.calculator2:id/result"));
    //         System.out.println("Calculator result: " + result.getText());

    //     } catch (MalformedURLException e) {
    //         e.printStackTrace();
    //     } finally {
    //         if (driver != null) {
    //             driver.quit();
    //         }
    //         if (appiumDriver != null) {
    //             appiumDriver.quit();
    //         }
    //     }
    }
}
