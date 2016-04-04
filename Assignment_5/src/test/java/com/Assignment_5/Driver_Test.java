package com.Assignment_5;

import com.Assignment_5.Domain.Driver;
import com.Assignment_5.Domain.Soft_Dev;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Driver_Test {

    private Driver driver;



    @Test
    public void testDriver() throws Exception {

        Assert.assertEquals(driver.getRatePerMonth(), 2000);

    }

    @After
    public void tearDown() throws Exception {

    }
}
