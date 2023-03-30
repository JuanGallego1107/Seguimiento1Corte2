package Ejemplo3;
public enum CarBrand{
            CAR1("Chevrolet"), CAR2("Mazda"), CAR3("Renault");
        private String Brand;

        CarBrand(String brand) {
            Brand = brand;
        }

        public String getBrand() {
            return Brand;
        }
    }

