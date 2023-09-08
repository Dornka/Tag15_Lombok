package org.example;


import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@Builder
public class Course {

    private int id;
    private String name;
    private Teacher teacher;
    @With
    public List<Student> students;

}
