package Core;

import Android.InitialAndroid;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class CaptureScreen{

    /*
    * Capture the screenshot at where the test is failed, and attached to the Allure report
    * */

    @Attachment(value ="Failure at ", type = "image/png")
    byte[] capScr(AppiumDriver driver, ITestResult result, String name){
        driver = InitialAndroid.getDriver();
        File file;
        file = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);
        String filepath = "C:\\Users\\glori\\IdeaProjects\\autoTest\\src\\Screens";
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmSS");
        try {
            FileUtils.copyFile(file, new File(filepath + File.separator + name + format.format(new Date()) + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
