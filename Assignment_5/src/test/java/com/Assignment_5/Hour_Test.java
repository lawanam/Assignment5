package com.Assignment_5;

import com.Assignment_5.Domain.Hours;
import com.Assignment_5.Domain.Soft_Dev;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Hour_Test {

    private Hours hrs;




    @Test
    public void testHour() throws Exception {

        Assert.assertEquals(hrs.getHoursWorked(), 2000);




    }

    @After
    public void tearDown() throws Exception {

    }

}
