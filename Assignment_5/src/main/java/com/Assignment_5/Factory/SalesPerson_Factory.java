package com.Assignment_5.Factory;

import com.Assignment_5.Domain.SalesPerson;
import com.Assignment_5.Domain.Secretery;

/**
 * Created by student on 2016/04/04.
 */
public class SalesPerson_Factory {

    public static SalesPerson getOccupation(String occupation)
    {
        SalesPerson sal = new SalesPerson.Builder(occupation )
                .build();

        return sal;

    }
}
