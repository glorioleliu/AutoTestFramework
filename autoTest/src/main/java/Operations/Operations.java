package Operations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;

import static AutoCore.AutoCore.*;

public class Operations {

    private static AppiumDriver driver = getDriver("android");
    public static void longTap(WebElement element, Long duration) throws Exception{
//        Actions actions = new Actions(driver);
//        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(duration))).release().perform();
    }

    public static void tap(WebElement element) throws Exception{
//        Actions actions = new Actions(driver);
//        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(1)).perform();
    }

    public static void tap(WebElement element, AppiumDriver driver1) throws Exception{
//        Actions actions = new Actions(driver);
//        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
        TouchAction touchAction = new TouchAction(driver1);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(1)).perform();
    }

    public static void click(WebElement element) throws Exception{
//        Actions actions = new Actions(driver);
//        MultiTouchAction multiTouchAction = new MultiTouchAction(driver);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

}
