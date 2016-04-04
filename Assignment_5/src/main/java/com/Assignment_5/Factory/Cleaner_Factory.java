package com.Assignment_5.Factory;

import com.Assignment_5.Domain.Cleaner;
import com.Assignment_5.Domain.ITPerson;

/**
 * Created by student on 2016/04/04.
 */
public class Cleaner_Factory {

    public static Cleaner getOccupation(String occupation)
    {
        Cleaner cleaner = new Cleaner.Builder(occupation )
                .build();

        return cleaner;

    }
}
