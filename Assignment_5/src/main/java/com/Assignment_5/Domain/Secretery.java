package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Secretery{

    private String occupation;

    public Secretery(Builder builder)
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

        public Secretery.Builder copy(Security sec)
        {
            this.occupation = sec.getOccupation();
            return this;
        }

        public Secretery build(){
            return new Secretery(this);
        }
    }
}
