package com.tlworld.java;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student[] students = {student1};
        for (int i = 0; i < students.length; i++) {
            System.out.println("students[0].grade = " + students[0].grade);
        }

    }
}
