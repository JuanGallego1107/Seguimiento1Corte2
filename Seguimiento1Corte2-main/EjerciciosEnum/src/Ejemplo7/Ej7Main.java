package Ejemplo7;

import java.util.ArrayList;
import java.util.List;

public class Ej7Main {
    public static void main(String[] args) {
        List<Double> gradesList = new ArrayList<Double>();
        gradesList.add(0,3.6);
        gradesList.add(1,4.8);
        gradesList.add(2,3.9);
        gradesList.add(3,4.2);
        System.out.println("These are the grades: "+gradesList);

        Double promedio = gradesList.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println("The grades average is: "+promedio);

        System.out.println("This is yout mathematics grade: "+gradesList.get(2));

    }
}
