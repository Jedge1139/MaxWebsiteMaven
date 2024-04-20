import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest{
    @Test (priority = 13)
    public void dropDownSetting() throws InterruptedException {
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
        WebElement scrolltoDropDown = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > div"));
        new Actions(driver)
                .moveToElement(scrolltoDropDown)
                .perform();
        Thread.sleep(1000);
        WebElement clickSettings = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > div > div > div > ul > li:nth-child(7)"));
        clickSettings.click();
        Thread.sleep(1000);

    }
    @Test (priority = 14)
    public void AutoplayPrev() throws InterruptedException {
        WebElement clickAutoPrev = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2)"));
        clickAutoPrev.click();
        Thread.sleep(1000);
    }
    @Test (priority = 15)
    public void AutoplayNext() throws InterruptedException {
        WebElement clickAutoNext = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > span:nth-child(2)"));
        clickAutoNext.click();
        Thread.sleep(1000);
    }
}
