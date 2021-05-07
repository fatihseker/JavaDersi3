package com.company;

public class StudentManager extends UserManager{

    public void add(Student student){
        System.out.println("öğrenci eklendi");
    }
    public void delete(Student student){
        System.out.println("öğrenci silindi");
    }
}
