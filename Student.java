package com.company;

public class Student extends User{
    private String branch;

    public Student(){
        super();
    }

    public Student(int id , String name , String lastName,String branch){
        super(id,name,lastName);
        this.branch=branch;

    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
