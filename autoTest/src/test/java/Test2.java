import Android.InitialAndroid;
import Core.TestListener;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static AutoCore.Log.info;

@Listeners(TestListener.class)
public class Test2 extends InitialAndroid {

    @Test(priority = 1)
    @Description("Verify the locator pin is place at the center of the screen")
    public void delivery_detail_pin() throws Exception{
        initiate();
        app.recordsList().tapOnRecord();
//        app.recordsList().findElements();
        app.deliveryDetail().verifyPin();
    }

    @Test(priority = 2)
    @Description("Verify the detail description is same as the list description")
    public void delivery_detail_description() throws Exception{
        initiate();
        String eText1 = app.recordsList().getListDescription();
        app.recordsList().tapOnRecord();
        String eText2 = app.deliveryDetail().getDetailDescription();
        Assert.assertEquals(eText1, eText2, " Same? ");
    }

    @Test(priority = 3)
    @Description("Tap on the 14th record in the list")
    public void delivery_list_tapOn14th() throws Exception{
        initiate();
        app.recordsList().tap14();
        app.deliveryDetail().verifyTyphoon();

    }


}
