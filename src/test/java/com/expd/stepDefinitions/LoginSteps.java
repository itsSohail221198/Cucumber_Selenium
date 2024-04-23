package com.expd.stepDefinitions;

import com.expd.pages.HomePage;
import com.expd.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver;

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);



    @Given("the URL is launched")
    public void the_url_is_launched() {
        loginPage.launchURL();
        loginPage.seleniumWait();
    }

    @Then("click the Login button in the Home Screen")
    public void click_the_login_button_in_the_home_screen() throws InterruptedException {
        loginPage.clickLoginHome();
        loginPage.seleniumWait();
    }

    @Then("user enters the username as {string}")
    public void user_enters_the_username_as(String userName) throws InterruptedException {
        loginPage.enterUserName(userName);
        loginPage.seleniumWait();
    }

    @Then("user enters the password as {string}")
    public void user_enters_the_password_as(String passWord) throws InterruptedException {
        loginPage.enterPassword(passWord);
        loginPage.seleniumWait();
    }

    @Then("click the login button in the login popup")
    public void click_the_login_button_in_the_login_popup() throws InterruptedException{
        loginPage.clickLoginBtn();
        loginPage.seleniumWait();

    }

    @Then("close the browser")
    public void closeTheBrowser() {
        loginPage.closeBrowser();
    }

    @Then("click the logout button")
    public void clickTheLogoutButton() {
        homePage.clickLogOut();
    }
}
