package Ejemplo8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej8Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>(Arrays.asList(
                new Animal("Tiger",24,"Carnivorous"),
                new Animal("Giraffe",31,"Herbivorous"),
                new Animal("Jaguar",12,"Carnivorous")
        ));
         animalList.add(new Animal("Turtle",56,"Omnivorous"));

         for(Animal animal: animalList){
             System.out.println("Name: "+animal.getName()+"\nAge: "+animal.getAge()+"\nFeeding: "+animal.getFeedingType());
             System.out.println("=========================");
         }
    }
}
