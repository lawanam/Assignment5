package com.Assignment_5;

import com.Assignment_5.Domain.Employee;
import com.Assignment_5.Domain.Lawyer;
import com.Assignment_5.Factory.Employee_Factory;
import com.Assignment_5.Factory.Lawyer_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Lawyer_Test {

    private Lawyer lawyer;

    @Before
    public void setUp() throws Exception {
        lawyer = Lawyer_Factory.getOccupation("Advocate");

    }


    @Test
    public void testLawyer() throws Exception {

        Assert.assertEquals(lawyer.getOccupation(), "100001");




    }
    @Test
    public void testNewUpdate() throws Exception {
        Lawyer lawyerUpdate = new Lawyer.Builder(lawyer.getOccupation() )
                .copy(lawyer)
                .build();

        Assert.assertEquals(lawyer.getOccupation(), "Advocate");

    }

    @After
    public void tearDown() throws Exception {

    }


}
