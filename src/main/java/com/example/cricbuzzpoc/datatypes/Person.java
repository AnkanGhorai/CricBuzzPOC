package com.example.cricbuzzpoc.datatypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private  String name;
    private Address address;
    private String email;
    private String contactNo;
}
