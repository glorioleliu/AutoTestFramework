import Android.InitialAndroid;
import Core.TestListener;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

//import static MobileObjects.DeliveryDetail.screenTitle;

@Listeners(TestListener.class)
public class Test1 extends InitialAndroid {

    @Test(priority = 4)
    @Description("Test for the Delivery List screen refreshing")
    public void delivery_list_longPress() throws Exception{
        app.recordsList().longPressOnRecord();
    }

    @Test(priority = 2)
    @Description("Test for the Delivery List screen refreshing")
    public void delivery_list_refresh() throws Exception{
        app.recordsList().checkPageLoad();
        app.recordsList().swipeDown();
        app.recordsList().checkRefreshing();
        app.recordsList().checkPageLoad();
    }

    @Test(priority = 3)
    @Description("Test for the Delivery List screen infinity scroll")
    public void delivery_list_infinity() throws Exception{
        for (int i = 1; i<10; i++){
            app.recordsList().checkPageLoad();
            app.recordsList().swipeUp();
        }
    }

    @Test(priority = 1)
    public void delivery_list_verification() throws Exception{
        app.recordsList().checkPageLoad();
        app.recordsList().findElements();
    }



}
