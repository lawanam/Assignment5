package com.Assignment_5;

import com.Assignment_5.Domain.HR;
import com.Assignment_5.Domain.Hours;
import com.Assignment_5.Domain.ITPerson;
import com.Assignment_5.Factory.HR_Factory;
import com.Assignment_5.Factory.ITPerson_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class HR_Test {

    private HR hr;

    @Before
    public void setUp() throws Exception {
        hr = HR_Factory.getOccupation("Employer");

    }


     public void testHR() throws Exception {

        Assert.assertEquals(hr.getOccupation(), "Employer");




    }
    @Test
    public void testNewUpdate() throws Exception {
        HR hrUpdate = new HR.Builder(hr.getOccupation() )
                .copy(hr)
                .build();

        Assert.assertEquals(hr.getOccupation(), "Employer");

    }

    @After
    public void tearDown() throws Exception {

    }

}
