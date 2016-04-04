package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Driver {
    private double ratePerMonth = 500;

    public Driver(Builder builder)
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

        public Builder copy(Driver driver)
        {
            this.ratePerMonth = driver.getRatePerMonth();
            return this;
        }

        public Driver build ()
        {
            return new Driver(this);
        }
    }
}

