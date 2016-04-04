package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Secretery;
import com.Assignment_5.Domain.Security;

/**
 * Created by student on 2016/04/04.
 */
public class Secretery_Factory {

    public static Secretery getOccupation(String occupation)
    {
        Secretery sec = new Secretery.Builder(occupation )
                .build();

        return sec;

    }
}
