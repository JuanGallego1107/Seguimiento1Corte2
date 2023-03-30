package Ejemplo6;

import java.util.ArrayList;
import java.util.List;

public class Ej6Main {
    public static void main(String[] args) {
        List<String> teenList = new ArrayList<String>();
        teenList.add(0,"Juan");
        teenList.add(1,"Camila");
        teenList.add(2,"Andres");
        System.out.println("The teenagers list is: "+ teenList);

        List<String> adultList = new ArrayList<String>();
        adultList.add(0,"Carlos");
        adultList.add(1,"Gloria");
        adultList.add(2,"Fabio");
        System.out.println("The adults list is: "+adultList);

        teenList.addAll(3,adultList);
        System.out.println("Both lists are: "+teenList);

        teenList.remove(3);
        System.out.println("This is the list without the index 3: "+teenList);

    }
}
