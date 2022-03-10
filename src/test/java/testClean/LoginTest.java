package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.AccountSection;
import page.LoginPage;
import page.MainPage;
import page.MenuSection;


public class LoginTest extends BaseTodoist {
    MainPage mainPage= new MainPage();
    LoginPage loginModal= new LoginPage();
    MenuSection menuSection = new MenuSection();
    AccountSection accountSection=new AccountSection();

    @Test
    public void verifyLoginTodoist() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("deni@email.com");
        loginModal.pwdTxtBox.setText("PassVerifi");
        loginModal.loginButton.click();
        menuSection.profileButton.click();
        Thread.sleep(2000);
        Assertions.assertTrue(accountSection.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");
    }
}
