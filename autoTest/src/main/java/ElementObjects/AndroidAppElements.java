package ElementObjects;

import AutoCore.AutoCore;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static AutoCore.AutoCore.getDriver;
import static Operations.AutoStatic.osType;

public class AndroidAppElements {

    public static String firstRecord = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
    public static String errorPage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView";
//    static AppiumDriverBuilder driver = getDriver(osType());
    private static AppiumDriver driver = getDriver("android");

    public static WebElement element(String xpath){
//        AppiumDriverBuilder driver = getDriver(osType());
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        boolean hasElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isDisplayed();
        if (hasElement){
            element = driver.findElementByXPath(xpath);
        }
        return element;
    }

}
