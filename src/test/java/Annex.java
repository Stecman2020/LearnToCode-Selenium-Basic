import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annex {

    private WebDriver driver;
    private final String BASE_URL = "https://wwweu.socialannex.com/public/login/index";

    @BeforeTest
    public void setUp(){

    }

    @Test
    public void annexLogin(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        driver.findElement(By.id("txtemail")).sendKeys("lukas.stec@sk.ibm.com");
        driver.findElement(By.id("txtpassword")).sendKeys("Release1.2020");
        driver.findElement(By.id("submit")).click();
        System.out.println("Directed to select Site ... ");
        Select environment = new Select(driver.findElement(By.name("cbosite")));
        environment.selectByVisibleText("MOLGroupUAT");
//        environment.selectByIndex(2);
        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
    }

    @AfterTest
    public void tearDown(){
//        driver.close();
//        driver.quit();
    }
}
