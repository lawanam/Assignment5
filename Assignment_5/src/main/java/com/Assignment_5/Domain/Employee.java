package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Employee {

    private String name;
    private String surname;
    private String IDNumber;
    private String email;
    private int EmpNumber;


    // public abstract double ratePerHour();
    public Employee(Builder builder)
    {

        IDNumber = builder.IDNumber;
        name = builder.name;
        surname = builder.surname;


    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNumber() {
        return EmpNumber;
    }


    public static class Builder {

        //Equivalent to setters

        private String name;
        private String surname;
        private String IDNumber;
        private String email;
        private int EmpNumber;


        public Builder(String IDNumber) {
            this.IDNumber = IDNumber;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder copy (Employee emp) {
            this.IDNumber = emp.getIDNumber();
            this.name = emp.getName();
            this.surname = emp.getSurname();


            return this;

        }
        public Employee build() {
            return new Employee(this);
        }
    }
}
