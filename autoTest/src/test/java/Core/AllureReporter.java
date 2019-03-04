package Core;

import Android.InitialAndroid;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

public class AllureReporter extends InitialAndroid implements IHookable {

    protected final AppiumDriver<?> driver;

    public AllureReporter(AppiumDriver<?> driver) {
        this.driver = driver;
    }

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        callBack.runTestMethod(testResult);
        if (testResult.getThrowable()!=null){
            try {
                takeScreenShot(testResult.getMethod().getMethodName());
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    @Attachment(value = "Failure in method {0}", type = "image/png")
    public byte[] takeScreenShot(String methodName) throws Exception{
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }


}
