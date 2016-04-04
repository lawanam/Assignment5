package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Cleaner {


    private String occupation;

    public Cleaner(Builder builder)
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

        public Builder copy(Cleaner cleaner)
        {
            this.occupation = cleaner.getOccupation();
            return this;
        }

        public Cleaner build ()
        {
            return new Cleaner(this);
        }
    }
}
