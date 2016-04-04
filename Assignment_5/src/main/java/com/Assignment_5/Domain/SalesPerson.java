package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class SalesPerson {

    private String occupation;

    public SalesPerson(Builder builder)
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

        public SalesPerson.Builder copy(SalesPerson sal)
        {
            this.occupation = sal.getOccupation();
            return this;
        }

        public SalesPerson build ()
        {
            return new SalesPerson(this);
        }
    }
}
