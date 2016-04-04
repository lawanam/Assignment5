package com.Assignment_5;

import com.Assignment_5.Domain.Employee;
import com.Assignment_5.Domain.Soft_Dev;
import com.Assignment_5.Factory.Employee_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Soft_Dev_Test {

    private Soft_Dev developer;




    @Test
    public void testSoft_Dev() throws Exception {

        Assert.assertEquals(developer.getRatePerMonth(), 2000);




    }

    @After
    public void tearDown() throws Exception {

    }

}
