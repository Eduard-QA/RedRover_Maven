import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lesson15 {
    @Test
    public void testSelenium() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        Assert.assertEquals(message.getText(), "Received!");

        driver.quit();
    }

    @Test
    public void testGoogle() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.co.uk/");

        System.out.println(driver.getTitle());

        WebElement textBox = driver.findElement(By.className("gLFyf"));
        textBox.sendKeys("Selenium");

        Thread.sleep(1000);
        WebElement submitButton = driver.findElement(By.className("gNO89b"));
        submitButton.click();

        WebElement downloadsLink = driver.findElement(By.linkText("Downloads"));
        downloadsLink.click();

        Assert.assertEquals(driver.getTitle(), "Downloads | Selenium");
        driver.quit();
    }
}

