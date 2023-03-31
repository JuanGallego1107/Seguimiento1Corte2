package Ejemplo2;

public class Ej2Main {
    public static void main(String[] args) {
        Ejemplo2 animalType = new Ejemplo2(Ejemplo2.Animals.AGUILA);
        animalType.AnimalType();
        Ejemplo2 animalType2  = new Ejemplo2(Ejemplo2.Animals.PERRO);
        animalType2.AnimalType();
        Ejemplo2 animalType3 = new Ejemplo2(Ejemplo2.Animals.RANA);
        animalType3.AnimalType();
    }
}
