package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Security{
    private String occupation;

    public Security(Builder builder)
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

        public Security.Builder copy(Security sec)
        {
            this.occupation = sec.getOccupation();
            return this;
        }

        public Security build ()
        {
            return new Security(this);
        }
    }
}
