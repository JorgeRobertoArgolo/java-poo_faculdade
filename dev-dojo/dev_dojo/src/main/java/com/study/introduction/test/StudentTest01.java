package com.study.introduction.test;

import com.study.introduction.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();//CRIACAO DO OBJETO
        student.setName("Jorge Roberto");
        student.setAge(20);
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println(student);
    }
}