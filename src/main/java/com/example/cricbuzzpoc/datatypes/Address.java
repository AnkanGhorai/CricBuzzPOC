package com.example.cricbuzzpoc.datatypes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
