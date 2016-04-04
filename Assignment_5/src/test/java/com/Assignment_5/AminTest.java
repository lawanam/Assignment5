package com.Assignment_5;

import com.Assignment_5.Domain.Admin;
import com.Assignment_5.Domain.Employee;
import com.Assignment_5.Factory.Admin_Factory;
import com.Assignment_5.Factory.Employee_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class AminTest {

    private Admin administrator;

    @Before
    public void setUp() throws Exception {
        administrator = Admin_Factory.getAdmin("100001", "Mzuvukile", "Lawana", 13000.0);

    }


    @Test
    public void testAdmin() throws Exception {

        Assert.assertEquals(administrator.getStaffNumber(), "100001");
        Assert.assertEquals(administrator.getAdminName(), "Mzuvukile");
        Assert.assertEquals(administrator.getAdminSurname(), "Lawana");
//


    }

    @Test
    public void testNewUpdate() throws Exception {
        Admin adminUpdate = new Admin.Builder(administrator.getStaffNumber())
                .copy(administrator)
                .adminName("Mzu")
                .adminSurname("Lawana")
                .build();

        Assert.assertEquals(adminUpdate.getAdminName(), "Mzu");
        Assert.assertEquals(adminUpdate.getAdminSurname(), "Lawana");
        //  Assert.assertEquals(adminUpdate.getIDNumber(),"100001");

    }

    @After
    public void tearDown1() throws Exception {

    }

}
