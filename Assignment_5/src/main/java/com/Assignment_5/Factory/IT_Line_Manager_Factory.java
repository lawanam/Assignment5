package com.Assignment_5.Factory;

import com.Assignment_5.Domain.HR;
import com.Assignment_5.Domain.IT_Line_Manager;

/**
 * Created by student on 2016/04/04.
 */
public class IT_Line_Manager_Factory {

    public static IT_Line_Manager getOccupation(String occupation)
    {
        IT_Line_Manager manager = new IT_Line_Manager.Builder(occupation )
                .build();

        return manager;

    }
}
