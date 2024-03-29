package test.java.com.autopage.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="email")
    WebElement usernameBox;
    @FindBy(id="passwd")
    WebElement passwordBox;
    @FindBy(name="SubmitLogin")
    WebElement SignInBtn;
    public void enterUsername(String uname){
        usernameBox.sendKeys(uname);
    }
    public void enterPassword(String upwd){
        passwordBox.sendKeys(upwd);
    }
    public void submitButton(){
        SignInBtn.click();
    }
}