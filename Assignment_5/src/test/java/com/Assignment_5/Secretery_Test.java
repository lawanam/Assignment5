package com.Assignment_5;

import com.Assignment_5.Domain.Secretery;
import com.Assignment_5.Domain.Security;
import com.Assignment_5.Factory.Secretery_Factory;
import com.Assignment_5.Factory.Security_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Secretery_Test{

    private Secretery sec;

    @Before
    public void setUp() throws Exception {
        sec = Secretery_Factory.getOccupation("Admin");

    }


    @Test
    public void testSecretery() throws Exception {

        Assert.assertEquals(sec.getOccupation(), "Admin");

    }
    @Test
    public void testNewUpdate() throws Exception {
        Secretery secUpdate = new Secretery.Builder(sec.getOccupation() )
                //.copy(sec)
                .build();

        Assert.assertEquals(sec.getOccupation(), "Admin");
    }

    @After
    public void tearDown() throws Exception {

    }
}
