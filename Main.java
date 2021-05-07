package com.company;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1111);
        student1.setName("fatih");
        student1.setLastName("şeker");
        student1.setBranch("10-L");

        Student student2 = new Student(2222,"emir","şeker","9-A");

        Instructor instructor1=new Instructor();
        instructor1.setId(123456);
        instructor1.setName("Engin");
        instructor1.setLastName("Demirok");
        instructor1.setDepartment("Math");

        Instructor instructor2=new Instructor(987654,"Ahmet Tekin", "Hatun","Hayat Bilgisi");

        StudentManager studentManager=new StudentManager();
        InstructorManager instructorManager=new InstructorManager();
        studentManager.add(student1);
        studentManager.delete(student2);
        instructorManager.add(instructor1);
        instructorManager.delete(instructor2);






    }
}
