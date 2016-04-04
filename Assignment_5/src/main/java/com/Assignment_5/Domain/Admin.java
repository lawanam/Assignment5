package com.Assignment_5.Domain;

/**
 * Created by student on 2016/04/04.
 */
public class Admin {

        String adminName;
        String adminSurname;
        String staffNumber;
        Double totalSalary;

        public Admin (Builder builder)
        {

            adminName = builder.adminName;
            adminSurname = builder.adminSurname;
            staffNumber = builder.staffNumber;
            totalSalary = builder.totalSalary;
        }


        public String getAdminName() {
            return adminName;
        }

        public String getAdminSurname() {
            return adminSurname;
        }

        public String getStaffNumber() {
            return staffNumber;
        }

        public Double getTotalSalary() {
            return totalSalary;
        }

        public static class Builder
        {
            String adminName;
            String adminSurname;
            String staffNumber;
            Double totalSalary;

            public Builder(String staffNumber)
            {
                this.staffNumber = staffNumber;
            }

            public Builder adminName(String adminName)
            {
                this.adminName = adminName;
                return this;
            }

            public Builder adminSurname(String adminSurname)
            {
                this.adminSurname = adminSurname;
                return this;
            }

            public Builder totalSalary(Double totalSalary)
            {
                this.totalSalary = totalSalary;
                return this;
            }
            public Builder copy(Admin administrator)
            {
                this.staffNumber = administrator.getStaffNumber();
                this.adminName = administrator.getAdminName();
                this.adminSurname = administrator.getAdminSurname();
                this.totalSalary = administrator.getTotalSalary();

                return this;
            }

            public Admin build()
            {
                return new Admin(this);
            }


        }

    }
