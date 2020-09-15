package com.example.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CroupDeletion extends TestBase {

    @Test
    public void testCroupDeletion() throws Exception {

        app.goToPageGroup();
        app.getGroupHelper().SelectedGroupe();
        app.getGroupHelper().DeletedGroupe();
        app.getGroupHelper().returnGroupPage();
    }




}


