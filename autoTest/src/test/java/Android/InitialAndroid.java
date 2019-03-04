package Android;

import Core.AppiumDriverBuilder;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class InitialAndroid  {
    public static AppiumDriver driver;
    protected LaApp app;

    @BeforeSuite(alwaysRun = true)
    public void initiate() throws MalformedURLException{
        AppiumDriverBuilder.AndroidDriverBuilder androidDriverBuilder = AppiumDriverBuilder.forAndroid();
        androidDriverBuilder.withURL(new URL("http://127.0.0.1:4723/wd/hub"));
        driver = androidDriverBuilder.build("com.lalamove.techchallenge",".LaApp");
        app = new LaApp(driver);
    }

    public static AppiumDriver getDriver(){
        return driver;
    }

}
