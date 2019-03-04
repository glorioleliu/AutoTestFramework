package AutoCore;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static AutoCore.Log.info;
import static Operations.AutoStatic.osType;

public class AutoCore {

    public static AppiumDriver driver = getDriver(osType());
    private static DesiredCapabilities capabilities = new DesiredCapabilities();

    public AutoCore(){
        getDriver(osType());
    }

    private void getDevice(String os){
        switch(os){
            case "ios":
                driver = new IOSDriver(capabilities);


            case "android":
//                capabilities.setCapability("AutomationName", "Appium");
                capabilities.setCapability(MobileCapabilityType.APPLICATION_NAME, "Appium");
                capabilities.setCapability("deviceName", "Nexus S");
                capabilities.setCapability("platformName","Android");
                capabilities.setCapability("platformVersion","7.0");
                capabilities.setCapability("udid", "emulator-5556");
                capabilities.setCapability("app", "C:\\Users\\glori\\IdeaProjects\\autoTest\\app\\app-tech-android-challenge-20180918.apk");
                capabilities.setCapability("appPackage", "com.lalamove.techchallenge");
                capabilities.setCapability("newCommandTimeout", "30");
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
        }
    }

    public static byte[] captureScr(AppiumDriver driver){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    public static AppiumDriver getDriver(String os) {
        switch(os){
            case "ios":
                driver = new IOSDriver(capabilities);
                break;

            case "android":
                capabilities.setCapability("AutomationName", "UIAutomator");
                capabilities.setCapability("deviceName", "Nexus S");
                capabilities.setCapability("platformName","Android");
                capabilities.setCapability("platformVersion","7.0");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("app", "C:\\Users\\glori\\IdeaProjects\\autoTest\\app\\app-tech-android-challenge-20180918.apk");
                capabilities.setCapability("appPackage", "com.lalamove.techchallenge");
                capabilities.setCapability("newCommandTimeout", "30");

                try {
                    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;

            case "Espresso":
                capabilities.setCapability("AutomationName", "Espresso");
                capabilities.setCapability("deviceName", "Nexus S");
                capabilities.setCapability("platformName","Android");
                capabilities.setCapability("platformVersion","7.0");
                capabilities.setCapability("udid", "emulator-5554");
                capabilities.setCapability("appPackage", "com.lalamove.techchallenge");
                capabilities.setCapability("newCommandTimeout", "30");

                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
        }
        return driver;
    }

    public static void longPress(WebElement target){
        TouchAction action = new TouchAction(driver);
        try {
            action.longPress(LongPressOptions
                    .longPressOptions()
                    .withElement(
                            ElementOption.element(target))).perform();
        }catch (NoSuchElementException no){
            Assert.assertFalse(no.getMessage().contains("Can't locate an element"),"NoSuchElementException");
        }
        info("Long Press on the Target Element -> " + target.getText());

//            alertHandle();
    }


    public void tap(WebElement target){
        TouchAction action = new TouchAction(driver);
        action.tap(TapOptions.tapOptions()
        .withElement(ElementOption
                .element(target)))
                .perform();

//            alertHandle();

        info("Tap on the Target Element -> " + target);

    }

    private static boolean isAlertPopup(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert();
            info("Alert Popup");
            return true;
        }catch (Exception e){
            info("No Alert Popup. Return " + e.fillInStackTrace().toString().isEmpty());
            return !e.fillInStackTrace().toString().isEmpty();
        }
    }

    private void alertHandle(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            info("Alert pop-up" + driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
        }catch (Exception e){
            boolean hasAlert = e.fillInStackTrace().toString().isEmpty();
            info("");
        }
    }
}
