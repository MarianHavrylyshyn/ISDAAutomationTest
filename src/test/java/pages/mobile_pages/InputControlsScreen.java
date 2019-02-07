package pages.mobile_pages;
import apps.MobileApp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class InputControlsScreen extends AbstractMobilePage {

    public void swipe(){

        MobileApp.getMobileDriver().performTouchAction(new TouchAction(MobileApp.getMobileDriver())
                .press(PointOption.point(921, 991))
                .moveTo(PointOption.point(333, 979)).release().perform());
    /*TouchAction<?> action = new TouchAction<>(MobileApp.getMobileDriver());
        action.press(PointOption.point(1000,900))
            .moveTo(PointOption.point(76, 950)).release();
        action.perform();*/
    }
}