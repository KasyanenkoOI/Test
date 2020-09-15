package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTwo extends TestBase {

    @Test
    public void testGroupCreationTwo() throws Exception {
        app.goToPageGroup();
        app.getGroupHelper().openInitGroupCreation();
        app.getGroupHelper().enterParamGroup(new GropeData("test3test3", "test3", "test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnGroupPage();
    }

}
