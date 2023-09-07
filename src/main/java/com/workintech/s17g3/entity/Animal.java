package com.workintech.s17g3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Animal {
    private long id;
    private String name;
    private double weight;
    private Gender gender;

}
