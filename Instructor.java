package com.company;

public class Instructor extends User{
    private String department;

    public Instructor() {

    }

    public Instructor(int id, String name, String lastName, String department) {
        super(id,name,lastName);
        this.department=getDepartment();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
