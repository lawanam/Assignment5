package com.Assignment_5.Factory;

import com.Assignment_5.Domain.HR;
import com.Assignment_5.Domain.ITPerson;

/**
 * Created by student on 2016/04/04.
 */
public class HR_Factory {

    public static HR getOccupation(String occupation)
    {
        HR hr = new HR.Builder(occupation )
                .build();

        return hr;

    }
}
