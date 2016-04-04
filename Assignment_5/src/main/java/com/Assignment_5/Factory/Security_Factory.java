package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Security;

/**
 * Created by student on 2016/04/04.
 */
public class Security_Factory {

    public static Security getOccupation(String occupation)
    {
        Security sec = new Security.Builder(occupation )
                .build();

        return sec;

    }
}
