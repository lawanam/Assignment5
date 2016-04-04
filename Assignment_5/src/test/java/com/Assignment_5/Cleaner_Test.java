package com.Assignment_5;

import com.Assignment_5.Domain.Cleaner;
import com.Assignment_5.Domain.ITPerson;
import com.Assignment_5.Factory.Cleaner_Factory;
import com.Assignment_5.Factory.ITPerson_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class Cleaner_Test{

    private Cleaner cleaner;

    @Before
    public void setUp() throws Exception {
        cleaner = Cleaner_Factory.getOccupation("Hygen");

    }


    @Test
    public void testCleaner() throws Exception {

        Assert.assertEquals(cleaner.getOccupation(), "Hygen");




    }
    @Test
    public void testNewUpdate() throws Exception {
        Cleaner cleanerUpdate = new Cleaner.Builder(cleaner.getOccupation() )
                .copy(cleaner)
                .build();

        Assert.assertEquals(cleaner.getOccupation(), "Hygen");

    }

    @After
    public void tearDown() throws Exception {

    }

}
