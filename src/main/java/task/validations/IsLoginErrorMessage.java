package task.validations;

import actions.WaitUntiElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormaAuthentication;

public class IsLoginErrorMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUntiElement.isVisible(webDriver, FormaAuthentication.alertError);
    }

    public static  String getTextError(WebDriver webDriver){
        WebElement element = webDriver.findElement(FormaAuthentication.alertError);
        return element.getText();
    }
}
