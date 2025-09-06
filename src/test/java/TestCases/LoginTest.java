package TestCases;

import Page.LoginPage;
import TestBase.WebTestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends WebTestBase {
     public LoginPage login;
   // public LoginPage Password;
    @BeforeMethod
    public  void setup(){
        initialization();
         login=new LoginPage(driver);

    }
    @Test
    public void Test1(){
        login.acceptcookies();
        login.enterusername();
        //commit;
    }


}
