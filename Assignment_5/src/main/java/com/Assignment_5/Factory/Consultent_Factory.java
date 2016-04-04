package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Consultence;
import com.Assignment_5.Domain.HR;

/**
 * Created by student on 2016/04/04.
 */
public class Consultent_Factory{

    public static Consultence getOccupation(String occupation)
    {
        Consultence con = new Consultence.Builder(occupation )
                .build();

        return con;

    }
}
