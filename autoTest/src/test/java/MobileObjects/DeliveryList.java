package MobileObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import org.testng.Assert;

import java.time.temporal.ChronoUnit;
import java.util.List;

import static AutoCore.Log.info;

public class DeliveryList extends ElementsFactory {

    @AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement listScreenTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement record;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[14]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public List<MobileElement> record14th;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[14]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement record14th1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public List<MobileElement> records;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ProgressBar")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement loading;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement errorLoading;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement refreshingList;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.ProgressBar")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement progressLoading;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement list_record_icon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.TextView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement errorListLoad;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement list_record_description;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement list_record_location;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView")
    @WithTimeout(chronoUnit = ChronoUnit.SECONDS, time = 5)
    public MobileElement list_record_recyclerViewer;

    public DeliveryList(AppiumDriver<?> driver) {
        super(driver);
    }

    //Tap on the particular record
    public void tapOnRecord(){
        tap(record);
//        info("Tapping on:" + record.getText());
    }

    //Function to get the List description on the list screen
    public String getListDescription(){
        return getDescription(list_record_description);
    }

    //test function to tap on the record of 14th
    public void tap14(){
        int a = records.size();
        info("a is : " +a);
        double h = record.getSize().getHeight();

        info("h is" + h);
        swipe((14-a)*h);
        info("a is now: " + a);
        tap(records.get(5));

    }

    //action to long press on the list record
    public void longPressOnRecord(){
        longPress(record);
        Assert.assertFalse(record.isDisplayed(), " Still displayed");
    }

    //find this element by the xpath
    public void findElements(){
        String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup";
        info("find elements size" + findElementsWithTimeout(xpath, 5).get(2));
//        swipe();
    }

    //Function to check if the page is refreshing
    public void checkRefreshing(){
        boolean is = refreshingList.isDisplayed();
            info("Refreshing the Delivery List. ");
        Assert.assertTrue(is);
    }

    //Function to check if the page list load properly
    public void checkPageLoad(){
        boolean isLoaded = !records.isEmpty();
        if (isLoaded) {
            checkErrorLoad();
            info("List is displayed");
        }
        Assert.assertTrue(isLoaded, "List Screen is having issue");
    }

    public void checkLoading(){
        boolean isLoading = progressLoading.isDisplayed();
        if(isLoading){
            info("List is loading more records");
        }
        Assert.assertTrue(isLoading, "List Screen is displaying");

    }
    //Check the error loading at the firs entry of the app
    public void checkErrorLoad(){
//        errorListLoad.isDisplayed();
        Assert.assertFalse(errorListLoad.isDisplayed(), errorListLoad.getText() + " -- Error on Loading entry list.");
    }

}
