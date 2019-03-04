package ElementObjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.ChronoUnit;

public class AndriodElements {
    @AndroidFindBy(xpath = "")
    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    public AndroidElement record;

    @AndroidFindBy(xpath = "")
    public AndroidElement loading;
}
