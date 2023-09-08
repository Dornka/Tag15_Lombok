package org.example;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Course {

    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Course() {

    }
}
