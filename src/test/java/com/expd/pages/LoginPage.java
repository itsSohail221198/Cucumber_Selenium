package com.expd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By btn_loginHome = By.xpath("//a[.='Log in']");
    By txt_userName_login = By.id("loginusername");
    By txt_password_login = By.id("loginpassword");
    By btn_login = By.xpath("//button[.='Log in']");
    By btn_close = By.xpath("//div[@id='logInModal']//button[@class='btn btn-secondary']");



    public void launchURL() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gs1-sohaila\\Desktop\\Selenium_Training\\chromedriver-win64\\chromedriverv123\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
    }

    public void seleniumWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void clickLoginHome() throws InterruptedException {
        driver.findElement(btn_loginHome).click();
        Thread.sleep(3000);
    }

    public void enterUserName(String userName) throws InterruptedException {
        driver.findElement(txt_userName_login).sendKeys(userName);
        Thread.sleep(3000);
    }

    public void enterPassword(String pwd) throws InterruptedException {
        driver.findElement(txt_password_login).sendKeys(pwd);
        Thread.sleep(3000);
    }

    public void clickLoginBtn() throws InterruptedException {
        driver.findElement(btn_login).click();
        Thread.sleep(3000);
    }

    public void closeBrowser(){
        driver.close();
    }


}

