
package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    private static WebDriver driver;
    private String baseUrl="https://www.google.com";  
    
    public GoogleSearchTest() {
        
    }

  
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
         WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(baseUrl);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }
    
    
    @Test
    public void testSearch(){
    driver.findElement(By.xpath(".//*[@name='q']")).click();
    driver.findElement(By.xpath(".//*[@name='q']")).clear();
    driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("Basketball");
    driver.findElement(By.xpath(".//*[@name='q']")).submit();
    }
}
