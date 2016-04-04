package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Consultence {

    private String occupation;

    public Consultence(Builder builder)
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

        public Builder copy(Consultence con)
        {
            this.occupation = con.getOccupation();
            return this;
        }

        public Consultence build ()
        {
            return new Consultence(this);
        }
    }
}
