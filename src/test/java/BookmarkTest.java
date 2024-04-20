import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BookmarkTest extends BaseTest{
    @Test( priority = 9)
    public void testMyStuff() throws InterruptedException {
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
        usernameInput.sendKeys("mtedge330@gmail.com");
        Thread.sleep(2000);
        passwordInput.sendKeys("8094Lake.");
        Thread.sleep(2000);
        loginButton.click();


        Thread.sleep(3000);
        WebElement profileSelect = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));        Thread.sleep(2000);
        profileSelect.click();
        Thread.sleep(3000);



        driver.get("https://play.max.com/");
        Thread.sleep(2000);
        WebElement myStuff = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > a:nth-child(2)"));
        myStuff.click();
        Thread.sleep(1000);
    }
    @Test (priority = 10)
    public void clickMyList() throws InterruptedException{
        WebElement popUp = driver.findElement(By.cssSelector("#tileList > div > div > div > div > button"));
        popUp.click();
        Thread.sleep(1000);
    }
    @Test (priority = 11)
    public void removeMyList() throws InterruptedException{
        WebElement removeButton = driver.findElement(By.cssSelector("li[aria-label='Remove From My List'] span[class='StyledDropdownOptionLabel-Beam-Web-Ent__sc-tx4x9j-1 gMjFTQ']"));
        removeButton.click();
        Thread.sleep(1000);
    }
    @Test (priority = 12)
    public void ClickHistory() throws InterruptedException{
        WebElement continueWatching = driver.findElement(By.cssSelector("#tab-label-my-stuff-page-rail-continue-watching-tab"));
        continueWatching.click();
        Thread.sleep(1000);
    }

}
