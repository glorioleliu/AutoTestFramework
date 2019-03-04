package Android;

import MobileObjects.DeliveryDetail;
import MobileObjects.DeliveryList;
import io.appium.java_client.AppiumDriver;

public class LaApp {
    public final AppiumDriver<?> driver;

    public LaApp(AppiumDriver<?> driver) {
        this.driver = driver;
    }

    public DeliveryList recordsList(){
        return new DeliveryList(driver);
    }

    public DeliveryDetail deliveryDetail(){
        return new DeliveryDetail(driver);
    }



}
