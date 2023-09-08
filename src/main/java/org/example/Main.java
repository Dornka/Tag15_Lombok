package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder()
                .id(100)
                .name("Max Mustermann")
                .address("Musterstraße 123")
                .grade(4)
                .build();

        Student student2 = Student.builder()
                .id(101)
                .name("Peter Mustermann")
                .address("Musterstraße 123")
                .grade(5)
                .build();

        Student updatedStudent1 = student1.withGrade(1);

        Teacher teacher1 = new Teacher(16, "Herrmann", "Mathematik");

        Course course1 = Course.builder()
                .id(1)
                .name("Mathematik Fortgeschritten")
                .teacher(teacher1)
                .students(List.of(student1))
                .build();

        Course updatedcourse1 = course1.withStudents(List.of(updatedStudent1));

        Course course2 = Course.builder()
                .id(2)
                .name("Mathematik Anfänger")
                .teacher(teacher1)
                .students(List.of(student2))
                .students(List.of(updatedStudent1))
                .build();

        System.out.println(updatedStudent1);
        System.out.println(teacher1);
        System.out.println(course1);
        System.out.println(updatedcourse1);
        System.out.println(course2);
    }
}