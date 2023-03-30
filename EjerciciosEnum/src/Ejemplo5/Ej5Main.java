package Ejemplo5;

public class Ej5Main {
    public static void main(String[] args) {
        Shoes shoes = Shoes.ADIDAS;
        System.out.println("Marca: "+shoes.name()+" \nTalla: "+shoes.getSize()+ "\nColor: "+shoes.getColor());
        System.out.println("===========================");
        Shoes shoes1 = Shoes.NIKE;
        System.out.println("Marca: "+shoes1.name()+" \nTalla: "+shoes1.getSize()+ "\nColor: "+shoes1.getColor());
        System.out.println("===========================");
        Shoes shoes2 = Shoes.NEWBALANCE;
        System.out.println("Marca: "+shoes2.name()+" \nTalla: "+shoes2.getSize()+ "\nColor: "+shoes2.getColor());

    }
}
