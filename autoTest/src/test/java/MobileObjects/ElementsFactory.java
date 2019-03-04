package MobileObjects;

import android.view.WindowManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static AutoCore.Log.info;

public class ElementsFactory {
    protected final AppiumDriver<?> driver;

    public ElementsFactory(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public MobileElement findElementWithTimeout(By by, int timeout){
        return (MobileElement)(new WebDriverWait(driver,timeout)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected List<MobileElement> findElementsWithTimeout(String xpath, int timeout){
       WebDriverWait wait = new WebDriverWait(driver, timeout);
       List<MobileElement> elements = new ArrayList<>();
        MobileElement targetElement = null;
       try {
           wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
           targetElement = (MobileElement)driver.findElement(By.xpath(xpath));
           elements.listIterator().add(targetElement);
           info("target element: " + targetElement.toString());
       }catch(Exception e){
           e.printStackTrace();
           info(elements.toString());
           return elements;

       }
       elements.listIterator().add(targetElement);
        return elements.size()>0?elements:null;
    }

    public void capScreen(){
        driver.getScreenshotAs(OutputType.BASE64);
    }

    public void longPress(WebElement target){
        TouchAction action = new TouchAction(driver);
        String eText = target.toString();
        try {
            action.longPress(LongPressOptions
                    .longPressOptions()
                    .withElement(ElementOption.element(target)))
                    .perform();
        }catch (NoSuchElementException no){
            Assert.assertFalse(no.getMessage().contains("Can't locate an element"),"NoSuchElementException");
        }
        info("Long Press on the Target Element -> " + eText);
    }

    public void tap(WebElement target){
        TouchAction action = new TouchAction(driver);

        String eText = target.toString();
        try {
            action.tap(TapOptions.tapOptions()
                    .withElement(ElementOption.element(target)))
                    .perform();
        }catch (Exception e){
            Assert.assertFalse(e.getMessage().contains("Can't locate an element"),"NoSuchElementException");
        }
        info("Tap on the Target Element -> " + eText);
    }

    public void swipeDown(){
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int startX = (int)(size.getWidth()*0.5);
        int startY = (int)(size.getHeight()*0.5);
        int offsetY = (int)(size.getHeight()*0.75);
        info("Swipe down to load the list of records");
        action
                .press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(PointOption.point(startX,offsetY))
                .release()
                .perform();
    }

    public void swipeUp(){
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int startX = (int)(size.getWidth()*0.5);
        int startY = (int)(size.getHeight()*0.99);
        int offsetY = (int)(size.getHeight()*0.01);
        info("Swipe up to load the list of records");
        action
                .press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(200)))
                .moveTo(PointOption.point(startX,offsetY))
                .release()
                .perform();
    }

    public void swipe(double y){
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int startX = (int)(size.getWidth()*0.5);
        int startY = (int)(size.getHeight()*0.9);
        int offsetY = (int)(startY - y);
        info("Swipe up to load the list of records");
        action
                .press(PointOption.point(startX,startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)))
                .moveTo(PointOption.point(startX,offsetY))
                .release()
                .perform();
    }


    public void swipeAndFind(String xpath){
        boolean isElementLoad = findElementsWithTimeout(xpath, 5).isEmpty();
        while(isElementLoad){
            swipe(160);
            isElementLoad = findElementsWithTimeout(xpath, 5).isEmpty();

        }

    }

    public String getDescription(MobileElement element){
        return element.getAttribute("text");
    }
}
