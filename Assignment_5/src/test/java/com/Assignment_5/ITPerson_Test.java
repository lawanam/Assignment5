package com.Assignment_5;

import com.Assignment_5.Domain.ITPerson;
import com.Assignment_5.Domain.Lawyer;
import com.Assignment_5.Factory.ITPerson_Factory;
import com.Assignment_5.Factory.Lawyer_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class ITPerson_Test {

    private ITPerson it;

    @Before
    public void setUp() throws Exception {
        it = ITPerson_Factory.getOccupation("Technocian");

    }


    @Test
    public void testIIPerson() throws Exception {

        Assert.assertEquals(it.getOccupation(), "1Technician");




    }
    @Test
    public void testNewUpdate() throws Exception {
        ITPerson itUpdate = new ITPerson.Builder(it.getOccupation() )
                .copy(it)
                .build();

        Assert.assertEquals(it.getOccupation(), "Technician");

    }

    @After
    public void tearDown() throws Exception {

    }

}
