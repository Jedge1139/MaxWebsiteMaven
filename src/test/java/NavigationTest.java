import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test ( priority = 4)
    public void testNavSeries() throws InterruptedException {
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
        Thread.sleep(2000);



        driver.get("https://play.max.com/");
        Thread.sleep(2000);
        WebElement NavButton = driver.findElement(By.id("63804712833774106717296664120388183507"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test ( priority = 5)
    public void testNavMovies() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.id("118136160767809091994252286816724543957"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test ( priority = 6)
    public void testNavHBO() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.id("280739271829666224300146756864105298374"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test ( priority = 7)
    public void testNavBRsports() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.id("283668703319952387532875752685746018477"));
        NavButton.click();
        Thread.sleep(1000);

    }
    @Test ( priority = 8)
    public void testNavnews() throws InterruptedException {
        WebElement NavButton = driver.findElement(By.id("330302309662554045248681082987851878813"));
        NavButton.click();
        Thread.sleep(1000);

    }
}
