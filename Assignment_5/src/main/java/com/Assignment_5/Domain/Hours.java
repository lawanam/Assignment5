package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Hours {
    int hoursWorked;

    public Hours(Builder builder)
    {
        hoursWorked = builder.hoursWorked;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public static class Builder
    {
        public int hoursWorked;

        public Builder(int hoursWorked)
        {
            this.hoursWorked = hoursWorked;
        }

        public Builder copy(Hours hours)
        {
            this.hoursWorked = hours.getHoursWorked();

            return this;
        }

        public Hours build ()
        {
            return new Hours(this);
        }
    }
}
