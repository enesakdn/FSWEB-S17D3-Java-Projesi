package com.workintech.s17g3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Kangaroo extends Animal{
        private double height;
        private boolean isAggressive;
}
