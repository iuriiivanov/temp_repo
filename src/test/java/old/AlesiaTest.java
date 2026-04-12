package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class AlesiaTest {

    @Test
    public void testMoshe() {
// 1234567890~!@#$%^&*()
        WebDriver driver = new ChromeDriver();
        driver.get("https://moshe.by/");

        try {
            driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[1]/a[2]")).click();
            driver.findElement(By.id("input-email")).sendKeys("delta_29@mail.ru");
            driver.findElement(By.id("input-password")).sendKeys("Bos5942062");
            driver.findElement(By.xpath("//*[@id='account']/button")).click();
            WebElement text = driver.findElement(By.xpath("//*[@id='content']/main/header/h1"));

            Assert.assertEquals(text.getText(), "Моя учётная запись");
        } finally {
            driver.quit();
        }
    }
}
