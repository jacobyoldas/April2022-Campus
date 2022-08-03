package AP_Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Talal_testCase {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Talal\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://campus.techno.study/");
        driver.manage().window().maximize();

        WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
        acceptCookies.click();

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("talalshatra@yahoo.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("12345");

        WebElement login = driver.findElement(By.xpath("//button[@aria-label='LOGIN']"));
        login.click();

        WebElement userIcon = driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-menu-trigger user-button mat-button mat-button-base ng-star-inserted']"));
        userIcon.click();

        WebElement languageIcon = driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-menu-trigger language-button mat-menu-item mat-menu-item-submenu-trigger ng-tns-c186-5 ng-star-inserted']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(languageIcon).perform();
    }
}
