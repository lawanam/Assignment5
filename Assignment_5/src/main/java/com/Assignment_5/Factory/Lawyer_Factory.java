package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Employee;
import com.Assignment_5.Domain.Lawyer;

/**
 * Created by student on 2016/04/04.
 */
public class Lawyer_Factory {

    public static Lawyer getOccupation(String occupation)
    {
        Lawyer lawyer = new Lawyer.Builder(occupation )
                .build();

        return lawyer;

    }

}
