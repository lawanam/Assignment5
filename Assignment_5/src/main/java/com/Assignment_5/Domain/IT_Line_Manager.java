package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class IT_Line_Manager {


    private String occupation;

    public IT_Line_Manager(Builder builder)
    {
        occupation = builder.occupation;
    }


    public String getOccupation() {
        return occupation;
    }

    public static class Builder
    {
        private String occupation;

        public Builder(String occupation)
        {
            this.occupation = occupation;
        }

        public Builder copy(IT_Line_Manager manager)
        {
            this.occupation = manager.getOccupation();
            return this;
        }

        public IT_Line_Manager build ()
        {
            return new IT_Line_Manager(this);
        }
    }
}
