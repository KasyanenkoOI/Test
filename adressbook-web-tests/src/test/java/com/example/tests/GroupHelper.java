package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper {
    private WebDriver driver;

    public GroupHelper(WebDriver driver) {
         this.driver = driver;
    }

    protected void returnGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }
    protected void DeletedGroupe() {
        driver.findElement(By.name("delete")).click();
    }
    protected void SelectedGroupe() {
        driver.findElement(By.name("selected[]")).click();
    }
    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void enterParamGroup(GropeData gropeData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(gropeData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(gropeData.getHeaderName());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(gropeData.getFooterName());
    }

    protected void openInitGroupCreation() {
      driver.findElement(By.name("new")).click();
    }
}
