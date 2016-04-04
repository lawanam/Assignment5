package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Tester {

    private String occupation;

    public Tester(Builder builder)
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

        public Tester.Builder copy(Security sec)
        {
            this.occupation = sec.getOccupation();
            return this;
        }

        public Tester build ()
        {
            return new Tester(this);
        }
    }
}
