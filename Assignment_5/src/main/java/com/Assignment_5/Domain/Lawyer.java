package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Lawyer {
    private String occupation;

    public Lawyer(Builder builder)
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

        public Lawyer.Builder copy(Lawyer lawyer)
        {
            this.occupation = lawyer.getOccupation();
            return this;
        }

        public Lawyer build ()
        {
            return new Lawyer(this);
        }
    }
}


