package com.workintech.s17g3.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@Getter
@Setter
public class AnimalException extends RuntimeException{
private HttpStatus status;

public AnimalException(String massage,HttpStatus status) {
super(massage);
this.status = status;
}
}
