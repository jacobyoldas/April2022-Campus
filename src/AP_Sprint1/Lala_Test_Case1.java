package AP_Sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lala_Test_Case1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\techno\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://campus.techno.study/");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        Thread.sleep(7000);

        String email ="ismayilovalala2@gmail.com";
        String password = "1234inputTEST";

        WebElement acceptALlCookies = driver.findElement(By.cssSelector("button[class='consent-give']"));
        acceptALlCookies.click();

        WebElement emailInput = driver.findElement(By.id("mat-input-0"));
        emailInput.sendKeys(email);

        WebElement passwordInput = driver.findElement(By.id("mat-input-1"));
        passwordInput.sendKeys(password);


        WebElement loginButton = driver.findElement(By.cssSelector("span[class='mat-button-wrapper']"));
        loginButton.click();

        WebElement calendarButton = driver.findElement(By.cssSelector("button[class='mat-focus-indicator mat-button mat-button-base mat-button-wrapper mat-button-unchecked']"));
        calendarButton.click();

        Thread.sleep(3000);


        String currentURL =driver.getCurrentUrl();
        System.out.println("Current URL : " + currentURL);

        String currentURLTwo = "https://campus.techno.study/courses-calendar";

        if (currentURL.equals(currentURLTwo)) {
            System.out.println("Pass");
        }else
            System.out.println("Fail");


    }
}
