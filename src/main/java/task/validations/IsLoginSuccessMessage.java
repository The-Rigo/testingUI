package task.validations;

import actions.WaitUntiElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormaAuthentication;

public class IsLoginSuccessMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUntiElement.isVisible(webDriver, FormaAuthentication.alertSuccess);
    }

    public static  String getTextSuccess(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormaAuthentication.alertSuccess);
        return element.getText();
    }
}
