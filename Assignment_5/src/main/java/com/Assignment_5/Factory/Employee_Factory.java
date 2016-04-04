package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Employee;

/**
 * Created by student on 2016/04/04.
 */
public class Employee_Factory {
    public static Employee getEmployee( String idNo, String name, String surname)
    {
        Employee emp = new Employee.Builder(idNo )
                .name(name)
                .surname(surname)
                .build();


        return emp;

    }


}
