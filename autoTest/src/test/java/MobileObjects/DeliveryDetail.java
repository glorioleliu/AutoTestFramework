package MobileObjects;

import android.view.WindowManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.temporal.ChronoUnit;

import static AutoCore.Log.info;

public class DeliveryDetail extends ElementsFactory{

    @AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public static MobileElement detailScreenTitle;

    @AndroidFindBy(id = "com.lalamove.techchallenge:id/ivDelivery")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public static MobileElement detailScreenHeadshot;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public static MobileElement backButton;

    @AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement listScreenTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement weatherInfo;

    @AndroidFindBy(id = "com.lalamove.techchallenge:id/ivDelivery")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement detail_icon;

    @AndroidFindBy(id = "com.lalamove.techchallenge:id/textView_address")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement detail_location;

    @AndroidFindBy(id = "com.lalamove.techchallenge:id/tvDescription")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement detail_description;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
    public MobileElement detail_center_pin;


    public DeliveryDetail(AppiumDriver<?> driver){
        super(driver);
    }

    //Verify if the mobile element is present
    public boolean isDisplay(MobileElement element){
        info("Element displayed? ->" + element.isDisplayed());
        return element.isDisplayed();
//        Assert.assertTrue(element.isDisplayed(),  element.getText()+" is displayed");
    }

    //Test function on clicking the back button
    public void clickOnBackButton(){
        backButton.click();
        Assert.assertTrue(listScreenTitle.isDisplayed(), "Click performs successfully");
    }

    //Test function to verify the pin locator, and whether is placed at center
    public void verifyPin(){
        Dimension size = driver.manage().window().getSize();
        double centerY = size.getHeight()*0.5;
        double centerX = size.getWidth()*0.5;
        double x = detail_center_pin.getCenter().getX();
        double y = detail_center_pin.getCenter().getY();

        boolean isCenter = centerX==x&&centerY==y;
        if (isCenter){
            info("The Location Pin is displayed at the center");
        }else {
            info("The Pin is not at Center");
        }

        info("\n" + "centerX: " + centerX + "\n" + "centerY:" + centerY + "\n" + "x:" + x + "\n" + "y:" + y);
        Assert.assertTrue(isCenter, "Pin not at Center");
    }

    //to get the value of the detail description on the detail page
    public String getDetailDescription(){
        return getDescription(detail_description);
    }

    //to verify the Typhoon signal sign at the detail screen
    public void verifyTyphoon(){
        Assert.assertTrue(weatherInfo.isDisplayed(), "Typhoon signal?");
    }


}
