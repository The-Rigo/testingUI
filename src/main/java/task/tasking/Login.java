package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.FormaAuthentication;
import ui.HomePageUI;

public class Login {
    public  static void as(WebDriver webDriver, String user, String pass){
        Click.on(webDriver, HomePageUI.formAuth);
        Enter.text(webDriver, FormaAuthentication.username, user);
        Enter.text(webDriver, FormaAuthentication.password, pass);
        Click.on(webDriver, FormaAuthentication.loginButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO,"Login");
    }
}
