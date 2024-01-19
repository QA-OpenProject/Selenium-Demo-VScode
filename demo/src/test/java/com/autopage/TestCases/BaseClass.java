package test.java.com.autopage.TestCases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.example.Utilities.ReadConfig;
public class BaseClass {
    ReadConfig read = new ReadConfig();
    public String googlebaseurl = read.getGoogleBaseURL();
    public String loginbaseurl = read.getLoginBaseURL();
    public String uname = read.getUsername();
    public String upwd = read.getPassword();
    public String SuccessURL = read.getSuccessURL();
    public WebDriver driver;
    public Logger logger;
    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger = Logger.getLogger("googledemo");
        PropertyConfigurator.configure("log4j.properties");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}