package ru.deliveryClub;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickLinkByClassName {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Надя\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void firstTest() {
        driver.get("https://www.google.com/");
        //класс gb_P относится к ссылке Почта
        driver.findElement(By.className("gb_P")).click();

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
    }

    @After
    public void close() {
        driver.quit();
    }
}
