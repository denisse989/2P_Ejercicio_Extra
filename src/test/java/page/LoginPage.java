package page;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    //PassVerifi pass
    //deni@email.com

    public TextBox emailTxtBox = new TextBox(By.xpath("//*[@id=\"email\"]"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//*[@id=\"password\"]"));
    public Button loginButton = new Button(By.xpath("//*[@id=\"login_form\"]/button"));


}
