package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Soft_Dev {

    Employee emp;

    double ratePerMonth = 2000;


    public Soft_Dev(Builder builder)
    {

        ratePerMonth = builder.ratePerMonth;
    }


    public double getRatePerMonth() {
        return ratePerMonth;
    }



    public static class Builder
    {
        private Double ratePerMonth;

        public Builder(Double ratePerMonth)
        {
            this.ratePerMonth = ratePerMonth;
        }

        public Builder copy(Soft_Dev developer)
        {
            this.ratePerMonth = developer.getRatePerMonth();
            return this;
        }

        public Soft_Dev build ()
        {
            return new Soft_Dev(this);
        }
    }
}