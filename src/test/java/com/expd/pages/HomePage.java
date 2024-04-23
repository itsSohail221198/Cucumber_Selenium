package com.expd.pages;

import com.expd.driverManager.DriverSafeThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By btn_logOut = By.xpath("//a[.='Log out']");

    public void clickLogOut() {
        DriverSafeThread.getDriver().findElement(btn_logOut).click();
    }

}
