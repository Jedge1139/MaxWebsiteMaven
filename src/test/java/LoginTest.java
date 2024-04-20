import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseTest {

    @Test( priority = 1)
    public void testInvalidLogin() throws InterruptedException{
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
        usernameInput.sendKeys("testcase@gmail.com");
        Thread.sleep(2000);
        passwordInput.sendKeys("test123.");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);


    }


    @Test ( priority = 2)
    public void testValidLogin() throws InterruptedException {
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
        usernameInput.sendKeys("");// Login Credintals Removed
        Thread.sleep(2000);
        passwordInput.sendKeys(""); // Login Credintals Removed
        Thread.sleep(2000);
        loginButton.click();
    }

    @Test ( priority = 3)
    public void testProfileSelect() throws InterruptedException{
        Thread.sleep(3000);
        WebElement profileSelect = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
        Thread.sleep(2000);
        profileSelect.click();
        Thread.sleep(2000);
    }
/*
    @Test ( priority = 4)
    public void testNavSeries() throws InterruptedException {
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
    @Test( priority = 9)
    public void testMyStuff() throws InterruptedException {
        driver.get("https://play.max.com/");
        Thread.sleep(1000);
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
    @Test (priority = 13)
    public void dropDownSetting() throws InterruptedException {
        driver.get("https://play.max.com/");
        Thread.sleep(1000);
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
    @Test(priority = 16)
    public void dropDownProfile() throws InterruptedException {
        driver.get("https://play.max.com/");
        Thread.sleep(1000);
        WebElement scrolltoDropDown = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > div"));
        new Actions(driver)
                .moveToElement(scrolltoDropDown)
                .perform();
        Thread.sleep(1000);
        WebElement clickProfile = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0 > nav > div.StyledNavRightContainer-Beam-Web-Ent__sc-19tahja-4.crpeDe > div > div > div > ul > li:nth-child(6)"));
        clickProfile.click();
        Thread.sleep(1000);

    }
    @Test (priority = 17)
    public void clickNewProfile() throws InterruptedException {
        WebElement clickNewProfile = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0.cCtVum > div.StyledPageTransitionContainer-Beam-Web-Ent__sc-tnbw1j-0.faoAls.skipNavFocusable > div > div.StyledProfilePickerSection-Beam-Web-Ent__sc-h1h161-2.kbUnzc > div.AddProfileLinkContainer-Beam-Web-Ent__sc-i4ha80-2.iDqcxM > a"));
        clickNewProfile.click();
        Thread.sleep(1000);
    }
    @Test (priority = 18)
    public void clickSkipPic() throws InterruptedException {
        WebElement clickSkip = driver.findElement(By.cssSelector("#layer-root-app-content > div.LayoutContentWrapper-Beam-Web-Ent__sc-v8sfp9-0.cCtVum > div.StyledPageTransitionContainer-Beam-Web-Ent__sc-tnbw1j-0.faoAls.skipNavFocusable > nav > div.StyledRightContainer-Beam-Web-Ent__sc-4pdwq8-3.hNhVSX > button"));
        clickSkip.click();
        Thread.sleep(1000);
    }
    @Test (priority = 19)
    public void CreateProile() throws InterruptedException{
        WebElement profileName = driver.findElement(By.cssSelector("input[aria-label='Profile Name']"));
        Thread.sleep(1000);
        profileName.sendKeys("TestProfile1");
        Thread.sleep(2000);
        WebElement newProfileBtn = driver.findElement(By.cssSelector("button[type='submit'] span[class='StyledText-Beam-Web-Ent__sc-14xy2rk-3 hZDlSb']"));
        newProfileBtn.click();
        Thread.sleep(1000);
    }

    @Test (priority = 20)
    public void testSearch() throws InterruptedException {
        driver.get("https://play.max.com/");
        Thread.sleep(2000);
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
    @Test ( priority = 24)
    public void testVideoPlayback() throws InterruptedException {

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
    */
}
