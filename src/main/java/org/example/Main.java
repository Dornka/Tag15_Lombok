package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(100);
        student1.setName("Max Mustermann");
        student1.setAddress("Musterstraße 123");
        student1.setGrade(4);

        Student student2 = Student.builder()
                .id(101)
                .name("Peter Mustermann")
                .address("Musterstraße 123")
                .grade(5)
                .build();

        Teacher teacher1 = new Teacher(16, "Herrmann", "Mathematik");

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("Mathematik Fortgeschritten");
        course1.setTeacher(teacher1);
        course1.setStudents(List.of(student1));

        Course course2 = Course.builder()
                .id(1)
                .name("Mathematik Anfänger")
                .teacher(teacher1)
                .students(List.of(student2))
                .students(List.of(student1))
                .build();

        System.out.println(student1);
        System.out.println(teacher1);
        System.out.println(course1);
        System.out.println(course2);
    }
}