package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    protected void goToPageGroup()  {
      driver.findElement(By.linkText("groups")).click();
    }
}
