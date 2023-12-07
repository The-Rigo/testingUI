package task.validations;

import actions.WaitUntiElement;
import org.openqa.selenium.WebDriver;
import ui.AddRemove;
import ui.CheckBoxes;

public class IsCheckboxElements {
    public static boolean visible(WebDriver webDriver){
        return WaitUntiElement.isVisible(webDriver, CheckBoxes.checkboxesA);
    }
}
