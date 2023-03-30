package Ejemplo5;
    enum Shoes {
        ADIDAS(36,"Blue and white."),
        NIKE(38,"Black."),
        REEBOOK(39,"White and orange."),
        NEWBALANCE(40,"Light green.");

        private final int size;
        private final String color;

        Shoes(int size, String color) {
            this.size = size;
            this.color = color;
        }

        public int getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }
    }

