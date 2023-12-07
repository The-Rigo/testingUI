package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxes;
import ui.HomePageUI;

public class CheckboxElements {
    public static void as (WebDriver driver){
        Click.on(driver, HomePageUI.checkBoxes);
        Click.on(driver, CheckBoxes.checkboxesA);
        Click.on(driver, CheckBoxes.checkboxesB);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO,"Checkboxes");
    }
}
