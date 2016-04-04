package com.Assignment_5.Factory;

import com.Assignment_5.Domain.ITPerson;
import com.Assignment_5.Domain.Lawyer;

/**
 * Created by student on 2016/04/04.
 */
public class ITPerson_Factory{

    public static ITPerson getOccupation(String occupation)
    {
        ITPerson it = new ITPerson.Builder(occupation )
                .build();

        return it;

    }
}
