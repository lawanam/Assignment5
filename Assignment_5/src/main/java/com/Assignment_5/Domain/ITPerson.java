package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class ITPerson {

    private String occupation;

    public ITPerson(Builder builder)
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

        public Builder copy(ITPerson itPerson)
        {
            this.occupation = itPerson.getOccupation();
            return this;
        }

        public ITPerson build ()
        {
            return new ITPerson(this);
        }
    }
}
