package AP_Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tugce_Test_2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/tugce/Desktop/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://campus.techno.study/user-courses");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement inputUserName = driver.findElement(By.id("mat-input-0"));
        inputUserName.sendKeys("tugcekose07@hotmail.com");

        WebElement inputPassword = driver.findElement(By.id("mat-input-1"));
        inputPassword.sendKeys("1234abcd");

        WebElement clickLogin = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
        clickLogin.click();


        WebElement clickCourse = driver.findElement(By.cssSelector("span[class='mat-button-wrapper']"));
        clickCourse.click();


        WebElement clickSyllabus = driver.findElement(By.xpath("(//*[text()=' Syllabus '])[4]"));
        clickSyllabus.click();

        driver.quit();



    }
}
