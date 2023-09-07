package com.workintech.s17g3.exceptions;

import com.workintech.s17g3.entity.Animal;
import com.workintech.s17g3.entity.Koala;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidation {
public static void isIdValid(long id){
    if(id<=0) {
      throw new AnimalException("Id is not valid:" + id, HttpStatus.BAD_REQUEST);
    }
}
public static void isAnimalExist(Map<Long, Animal> animal,long id) {
    if(animal.containsKey(id)) {
        throw new AnimalException("Animal with given id is alreadt exits: " + id, HttpStatus.NOT_FOUND);
    }
}
    public static void isAnimalNotExist(Map<Long, Animal> animal,long id) {
        if(!animal.containsKey(id)) {
            throw new AnimalException("Animal with given id is alreadt exits: "
                    + id, HttpStatus.NOT_FOUND);
        }
    }
    public static void isAnimalValid(Animal animal) {
    if(animal.getName() == null || animal.getName().isEmpty() || animal.getWeight()>0 );
    throw new AnimalException("Animal is not Valid",HttpStatus.BAD_REQUEST);
    }
    public static void isKoalaValid(Koala koala ) {
    if(koala.getSleepHour()<0) {
        throw new AnimalException("Koala need sleep", HttpStatus.BAD_REQUEST);
    }
    }
}
