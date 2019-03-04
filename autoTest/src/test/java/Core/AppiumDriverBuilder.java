package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver<?>> {

    public static AndroidDriverBuilder forAndroid(){
        return new AndroidDriverBuilder();
    }

    public static class AndroidDriverBuilder extends AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver<?>> {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        @Override
        public AndroidDriver<?> build(String appPackage, String appActivity){
            capabilities.setCapability("AutomationName", "UIAutomator");
            capabilities.setCapability("deviceName", "Nexus S");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","7.0");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("app", "C:\\Users\\glori\\IdeaProjects\\autoTest\\app\\app-tech-android-challenge-20180918.apk");
            capabilities.setCapability("appPackage", "com.lalamove.techchallenge");
//            capabilities.setCapability("newCommandTimeout", "30");

            return new AndroidDriver<AndroidElement>(url, capabilities);
        }
    }

    protected URL url;

    @SuppressWarnings("unchecked")
    public SELF withURL(URL url){
        this.url =url;
        return (SELF) this;

    }

    public abstract DRIVER build(String appPackage, String appActivity);
}
