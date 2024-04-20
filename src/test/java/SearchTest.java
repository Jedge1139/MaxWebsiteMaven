import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test (priority = 20)
    public void testSearch() throws InterruptedException {
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
        Thread.sleep(3000);
        // Navigate to the homepage
        WebElement search = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > a:nth-child(1)"));
        Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
        // Perform a valid search
        WebElement TypeSearch = driver.findElement(By.cssSelector("input[placeholder='Find movies, shows, and more']"));
        Thread.sleep(2000);
        TypeSearch.sendKeys("Band of Brothers");
        Thread.sleep(2000);

    }

    @Test (priority = 21)
    public void testSearchNavDoc() throws InterruptedException {
        driver.get("https://play.max.com/search");
        Thread.sleep(2000);
        WebElement NavButton = driver.findElement(By.cssSelector("#null\\:\\:GENRE\\:\\:PREFIX\\:\\:Documentaries"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test (priority = 22)
    public void testSearchNavCrime() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.cssSelector("#null\\:\\:GENRE\\:\\:PREFIX\\:\\:Crime"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test (priority = 23)
    public void testSearchNavReality() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.cssSelector("#null\\:\\:GENRE\\:\\:PREFIX\\:\\:Reality"));
        NavButton.click();
        Thread.sleep(1000);

    }

}
