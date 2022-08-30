package com.example.demo.topic;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
