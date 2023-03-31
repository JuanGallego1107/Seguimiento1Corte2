package Ejemplo2;

public class Ejemplo2 {

    enum Animals {
        PERRO,
        GATO,
        ELEFANTE,
        AGUILA,
        RANA;
    }
    Animals animals;

    public Ejemplo2(Animals animals) {
        this.animals = animals;
    }

    public void AnimalType(){
        switch(animals){
            case PERRO : {
                System.out.println("El perro es un Canino.");
                break;
            }
            case GATO: {
                System.out.println("El gato es un Felino.");
                break;
            }
            case RANA: {
                System.out.println("La rana es un Anfibio.");
                break;
            }
            case AGUILA: {
                System.out.println("El aguila es un Ave.");
                break;
            }
            case ELEFANTE: {
                System.out.println("El elefante es un Mamifero.");
                break;
            }
            default:{
                System.out.println("No tenemos informacion sobre ese animal.");
                break;
            }
        }

    }
}
