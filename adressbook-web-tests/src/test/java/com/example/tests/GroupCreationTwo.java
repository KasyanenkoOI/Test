package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTwo extends TestBase {

    @Test
    public void testGroupCreationTwo() throws Exception {
        goToPageGroup();
        openInitGroupCreation();
        enterParamGroup(new GropeData("test3test3", "test3", "test3"));
        submitGroupCreation();
        returnGroupPage();
    }

}
