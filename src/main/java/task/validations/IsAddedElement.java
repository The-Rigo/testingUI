package task.validations;

import actions.WaitUntiElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;

public class IsAddedElement{
    public static boolean visible(WebDriver webDriver){
        return WaitUntiElement.isVisible(webDriver, AddRemove.add);
    }
}
