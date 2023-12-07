package ui;

import org.openqa.selenium.By;

public class FormaAuthentication {
    public static By username = By.id("username");
    public static By password = By.id("password");
    public static By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    public static By alertSuccess = By.xpath("//div[@id='flash']");
    public static By alertError = By.xpath("//div[@id='flash']");

}
