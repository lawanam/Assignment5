package com.Assignment_5;

import com.Assignment_5.Domain.Consultence;
import com.Assignment_5.Domain.HR;
import com.Assignment_5.Factory.Consultent_Factory;
import com.Assignment_5.Factory.HR_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Consultent_Test {

    private Consultence con;

    @Before
    public void setUp() throws Exception {
        con = Consultent_Factory.getOccupation("For software");

    }


    public void testConsultent() throws Exception {

        Assert.assertEquals(con.getOccupation(), "for software");




    }
    @Test
    public void testNewUpdate() throws Exception {
        Consultence conUpdate = new Consultence.Builder(con.getOccupation() )
                .copy(con)
                .build();

        Assert.assertEquals(con.getOccupation(), "for sofware");

    }

    @After
    public void tearDown() throws Exception {

    }

}
