package ru.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistanceTest() {
        Point p = new Point(2, 4);
        
        Assert.assertEquals( (p.distance(1,4) ),2);
    }

}
