package Page;

import Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    @FindBy(xpath = "//input[@data-id='inputUsername']")
    WebElement User_name;
    @FindBy(xpath=" //input[@type='password']")
    WebElement Password;
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookies;
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[1]")
    WebElement cross;
    public void acceptcookies(){
        acceptCookies.click();
        cross.click();


    }
    public void enterusername(){
        User_name.sendKeys(PropertyReader.getPropertyValue("username"));
        Password.sendKeys(PropertyReader.getPropertyValue("password"));

    }
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
