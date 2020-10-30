import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registracia {

    private WebDriver driver;
    private final String BASE_URL = "http://localhost:8888/registracia.php";

    @BeforeTest
    public void setUp(){

    }

    @Test
    public void positiveRegistrationTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("gumma@centrum.sk");

        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("gUmmA");

        driver.findElement(By.name("surname")).clear();
        driver.findElement(By.name("surname")).sendKeys("Awesome");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Mcbp2020");

        driver.findElement(By.name("password-repeat")).clear();
        driver.findElement(By.name("password-repeat")).sendKeys("Mcbp2020");

        driver.findElement(By.cssSelector("button")).click();

    }

    @Test
    public void negativeRegistrationTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("gumma@centrum.sk");

        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("gUmmA");

        driver.findElement(By.name("surname")).clear();
        driver.findElement(By.name("surname")).sendKeys("Velky");

        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Mcbp2020");

        driver.findElement(By.name("password-repeat")).clear();
        driver.findElement(By.name("password-repeat")).sendKeys("Mcbp2020");

        driver.findElement(By.cssSelector("div.container button")).click();

    }

    @AfterTest
    public void tearDown(){
//        driver.close();
//        driver.quit();
    }
}
