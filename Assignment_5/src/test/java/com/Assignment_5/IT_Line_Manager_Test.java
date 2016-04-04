package com.Assignment_5;

import com.Assignment_5.Domain.HR;
import com.Assignment_5.Domain.IT_Line_Manager;
import com.Assignment_5.Factory.HR_Factory;
import com.Assignment_5.Factory.IT_Line_Manager_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class IT_Line_Manager_Test {

    private IT_Line_Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = IT_Line_Manager_Factory.getOccupation("Operational Manager ");

    }


    public void testIT_Line_Manager() throws Exception {

        Assert.assertEquals(manager.getOccupation(), "Operational Manager");




    }
    @Test
    public void testNewUpdate() throws Exception {
        IT_Line_Manager managerUpdate = new IT_Line_Manager.Builder(manager.getOccupation() )
                .copy(manager)
                .build();

        Assert.assertEquals(manager.getOccupation(), "Operational Manager");

    }

    @After
    public void tearDown() throws Exception {

    }
}
