package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Security;
import com.Assignment_5.Domain.Tester;

/**
 * Created by student on 2016/04/04.
 */
public class Tester_Factory{
    public static Tester getOccupation(String occupation)
    {
        Tester tel = new Tester.Builder(occupation )
                .build();

        return tel;

    }
}
