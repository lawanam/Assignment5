package com.Assignment_5;

import com.Assignment_5.Domain.Employee;
import com.Assignment_5.Factory.Employee_Factory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/04.
 */
public class EmployeeTest {



        private Employee emp;

        @Before
        public void setUp() throws Exception {
            emp = Employee_Factory.getEmployee("100001", "Mzuvukile", "Lawana");

        }


        @Test
        public void testEmployee() throws Exception {

            Assert.assertEquals(emp.getIDNumber(), "100001");
            Assert.assertEquals(emp.getName(), "Mzuvukile");
            Assert.assertEquals(emp.getSurname(), "Lawana");



        }
       @Test
        public void testNewUpdate() throws Exception {
            Employee personUpdate = new Employee.Builder(emp.getIDNumber() )
                    .copy(emp)
                    .name("Mzu")
                    .surname("Lawana")
                    .build();

            Assert.assertEquals(personUpdate.getName(), "Mzu");
            Assert.assertEquals(personUpdate.getSurname(), "Lawana");
            Assert.assertEquals(personUpdate.getIDNumber(),"100001");

    }

    @After
    public void tearDown() throws Exception {

    }

        }

