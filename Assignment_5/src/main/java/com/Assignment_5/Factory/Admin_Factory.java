package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Admin;

/**
 * Created by student on 2016/04/04.
 */
public class Admin_Factory {

    public static Admin getAdmin(String adminName, String adminSurname, String staffNumber, double totalSalary)

    {
        Admin administrator = new Admin.Builder(staffNumber)
                .adminName(adminName)
                .adminSurname(adminSurname)
                .totalSalary(totalSalary)
                .build();


        return administrator;

    }
}
