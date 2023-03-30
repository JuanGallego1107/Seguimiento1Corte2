package Ejemplo4;

public enum Incomes {
    AVERAGE, PLUS, MINUS;

    int statistics(int April,int August, int November){
        switch(this){
            case AVERAGE: {
                return (April + August + November) / 3;
            }
            case PLUS: {
                return April+August+November;
            }
            case MINUS: {
                return April-August-November;
            }
            default:{
                throw new AssertionError("Unknown operation");
            }

        }
    }
}
