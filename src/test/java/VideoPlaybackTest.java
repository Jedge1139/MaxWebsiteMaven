import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VideoPlaybackTest extends BaseTest {
    @Test ( priority = 24)
    public void testVideoPlayback() throws InterruptedException {
        // Navigate to the login page
        driver.get("https://www.max.com/?reason=anonymous&returnUrl=https%3A%2F%2Fplay.max.com%2F");
        driver.findElement(By.cssSelector("body > div:nth-child(1) > article:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > nav:nth-child(2) > div:nth-child(3) > div:nth-child(1) > a:nth-child(1)")).click();
        Thread.sleep(2000);

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[3]/div[2]/gi-login-username-and-mvpd")).getShadowRoot()
                .findElement(By.cssSelector("div > div > div.login-username-container > div > gi-login-username")).getShadowRoot().findElement(By.id("login-username-input"));
        Thread.sleep(2000);
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[3]/div[2]/gi-login-username-and-mvpd")).getShadowRoot()
                .findElement(By.cssSelector("div > div > div.login-username-container > div > gi-login-username")).getShadowRoot().findElement(By.id("login-password-input"));
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[3]/div[2]/gi-login-username-and-mvpd")).getShadowRoot()
                .findElement(By.cssSelector("div > div > div.login-username-container > div > gi-login-username")).getShadowRoot().findElement(By.cssSelector("gi-track-analytics-events > div > gi-form > form > div.button-group > button.button.submit-button.button--loud.button--medium.button--full-width"));
        Thread.sleep(2000);
        // Perform actions within the Shadow DOM
        usernameInput.sendKeys(""); // Login Credintals Removed
        Thread.sleep(2000);
        passwordInput.sendKeys(""); // Login Credintals Removed
        Thread.sleep(2000);
        loginButton.click();


        Thread.sleep(3000);
        WebElement profileSelect = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));        Thread.sleep(2000);
        profileSelect.click();
        Thread.sleep(3000);



        driver.get("https://play.max.com/");
        Thread.sleep(2000);

        driver.get("https://play.max.com/mini-series/6a0a0227-f567-46ba-9a2d-04374c5f6193");
        Thread.sleep(2000);
        // Locate the video player element
        WebElement video = driver.findElement(By.cssSelector(" #tileList > div > div:nth-child(1)"));
        Thread.sleep(2000);
        video.click();
        Thread.sleep(1000);
    }



    @Test (priority = 25)
    public void testVideoPlayBtn() throws InterruptedException {
        WebElement scrolltoPause = driver.findElement(By.cssSelector("#overlay-root > div:nth-child(4) > div > div.ControlsContainer-Beam-Web-Ent__sc-1la552d-1.byFmvQ > div.ControlsFooter-Beam-Web-Ent__sc-1la552d-8.Dxtav > div.ControlsFooterBottom-Beam-Web-Ent__sc-1la552d-10.hltjmH > div.ControlsFooterBottomMiddle-Beam-Web-Ent__sc-1la552d-13.dseIsp > div > button.PlayerButton-Beam-Web-Ent__sc-1mvfp60-0.dpGNDK"));
        new Actions(driver)
                .moveToElement(scrolltoPause)
                .perform();
        Thread.sleep(2000);
        scrolltoPause.click();
        Thread.sleep(2000);
    }
    @Test (priority = 26)
    public void testVideoReversBtn() throws InterruptedException {
        WebElement scrolltoPause = driver.findElement(By.cssSelector("#overlay-root > div:nth-child(4) > div > div.ControlsContainer-Beam-Web-Ent__sc-1la552d-1.byFmvQ > div.ControlsFooter-Beam-Web-Ent__sc-1la552d-8.Dxtav > div.ControlsFooterBottom-Beam-Web-Ent__sc-1la552d-10.hltjmH > div.ControlsFooterBottomMiddle-Beam-Web-Ent__sc-1la552d-13.dseIsp > div > button:nth-child(1)"));
        new Actions(driver)
                .moveToElement(scrolltoPause)
                .perform();
        Thread.sleep(2000);
        scrolltoPause.click();
        Thread.sleep(2000);
    }
    @Test (priority = 27)
    public void testVideoForwardBtn() throws InterruptedException {
        WebElement scrolltoPause = driver.findElement(By.cssSelector("#overlay-root > div:nth-child(4) > div > div.ControlsContainer-Beam-Web-Ent__sc-1la552d-1.byFmvQ > div.ControlsFooter-Beam-Web-Ent__sc-1la552d-8.Dxtav > div.ControlsFooterBottom-Beam-Web-Ent__sc-1la552d-10.hltjmH > div.ControlsFooterBottomMiddle-Beam-Web-Ent__sc-1la552d-13.dseIsp > div > button:nth-child(3)"));
        new Actions(driver)
                .moveToElement(scrolltoPause)
                .perform();
        Thread.sleep(2000);
        scrolltoPause.click();
        Thread.sleep(2000);
    }
    @Test (priority = 28)
    public void testVideoPauseBtn() throws InterruptedException {
        WebElement scrolltoPause = driver.findElement(By.cssSelector("#overlay-root > div:nth-child(4) > div > div.ControlsContainer-Beam-Web-Ent__sc-1la552d-1.byFmvQ > div.ControlsFooter-Beam-Web-Ent__sc-1la552d-8.Dxtav > div.ControlsFooterBottom-Beam-Web-Ent__sc-1la552d-10.hltjmH > div.ControlsFooterBottomMiddle-Beam-Web-Ent__sc-1la552d-13.dseIsp > div > button.PlayerButton-Beam-Web-Ent__sc-1mvfp60-0.dpGNDK"));
        new Actions(driver)
                .moveToElement(scrolltoPause)
                .perform();
        Thread.sleep(2000);
        scrolltoPause.click();
        Thread.sleep(2000);
    }
}
