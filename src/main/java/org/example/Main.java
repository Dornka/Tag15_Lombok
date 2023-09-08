package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Max Mustermann");
        student1.setAddress("Musterstraße 123");
        student1.setGrade(4);

        Teacher teacher1 = new Teacher(1, "Herrmann", "Mathematik");

        Course course = new Course();
        course.setId(1);
        course.setName("Mathematik Fortgeschritten");
        course.setTeacher(teacher1);
        course.setStudents(List.of(student1));

        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(course);
    }
}