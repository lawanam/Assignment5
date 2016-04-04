package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class HR {

    private String occupation;

    public HR(Builder builder)
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

        public Builder copy(HR hr)
        {
            this.occupation = hr.getOccupation();
            return this;
        }

        public HR build ()
        {
            return new HR(this);
        }
    }
}
