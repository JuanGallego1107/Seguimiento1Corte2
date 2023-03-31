package Ejemplo9;

import java.util.ArrayList;
import java.util.List;

public class Ej9Main {
    public static void main(String[] args) {
        List<String> vegFruitList = new ArrayList<>();

        vegFruitList.add("Apple");
        vegFruitList.add("Lettuce");
        vegFruitList.add("Broccoli");
        vegFruitList.add("Onion");
        vegFruitList.add("Pear");
        System.out.println("This is the products list: "+vegFruitList);

        List<String> VegList = vegFruitList.subList(1,4);
        System.out.println("This is the vegetables list: "+VegList);
    }
}
