import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Xpath {

    public class CssSelector {

        private WebDriver driver;
        private final String BASE_URL = "http://localhost:8888/tabulka.php";

        @BeforeTest
        public void setUp(){

        }

        @Test
        public void firstTest(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(BASE_URL);
            driver.findElement(By.xpath("")).click();


        }

        @AfterTest
        public void tearDown(){
//        driver.close();
//        driver.quit();
        }
    }
}
