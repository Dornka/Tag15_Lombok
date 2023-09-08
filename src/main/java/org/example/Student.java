package org.example;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
public class Student {
    private int id;
    private String name;
    private String address;
    @With
    private int grade;
}

