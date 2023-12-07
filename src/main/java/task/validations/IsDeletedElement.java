package task.validations;

import actions.WaitUntiElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;

public class IsDeletedElement {
    public static boolean visible(WebDriver webDriver){
        return WaitUntiElement.isVisible(webDriver, AddRemove.remove);
    }
}
