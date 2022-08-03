package AP_Sprint1;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_CourseIcon_1 {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Yasin\\Downloads\\ChromeDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.get("https://campus.techno.study/");
    driver.manage().window().maximize();

    WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
    acceptCookies.click();
    WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
    username.sendKeys("yasinyoldas6666@gmail.com");
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
    password.sendKeys("42386032480");
    WebElement login = driver.findElement(By.xpath("//button[@aria-label='LOGIN']"));
    login.click();
    WebElement details = driver.findElement(By.xpath("(//*[text()=' Details '])[2]"));
    details.click();

    WebElement frameIndex= driver.findElement(By.xpath("(//*[@id='gsi_488244_35548'])[1]"));
    wait.until(ExpectedConditions.visibilityOf(frameIndex));
//    driver.switchTo().frame(frameIndex);
//
//    WebElement signInWithGoogle = driver.findElement(By.xpath("//span[text()='Sign in with Google']"));
//    signInWithGoogle.click();
//
//    String mainWindow = driver.getWindowHandle();
//    System.out.println(mainWindow);
//
//    // Get all window handles(id) and using for each loop switch to other window
//    Set<String> windowHandles = driver.getWindowHandles();
//    for (String windowHandle : windowHandles) {
//      driver.switchTo().window(windowHandle);
//    }
//
//    WebElement signInGmailWindow = driver.findElement(By.xpath("//*[@id='identifierId']"));
//    signInGmailWindow.sendKeys("tyren_hollisei@gmail.com");
//    WebElement nextButton= driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
//    nextButton.click();
//    WebElement tryAgainButton = driver.findElement(By.xpath("//*[@id='next']/div/button"));
//    tryAgainButton.click();
//
//    driver.switchTo().window(mainWindow);


    //driver.quit();


  }

}
