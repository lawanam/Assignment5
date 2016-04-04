package com.Assignment_5;

import com.Assignment_5.Domain.Lawyer;
import com.Assignment_5.Domain.Security;
import com.Assignment_5.Factory.Lawyer_Factory;
import com.Assignment_5.Factory.Security_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Security_Test{

    private Security sec;

    @Before
    public void setUp() throws Exception {
        sec = Security_Factory.getOccupation("Care Taker");

    }


    @Test
    public void testLawyer() throws Exception {

        Assert.assertEquals(sec.getOccupation(), "Care Taker");


    }
    @Test
    public void testNewUpdate() throws Exception {
        Security secUpdate = new Security.Builder(sec.getOccupation() )
                .copy(sec)
                .build();

        Assert.assertEquals(sec.getOccupation(), "Care Taker");
    }

    @After
    public void tearDown() throws Exception {

    }

}
