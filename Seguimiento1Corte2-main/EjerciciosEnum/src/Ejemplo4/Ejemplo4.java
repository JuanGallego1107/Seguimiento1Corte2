package Ejemplo4;

public class Ejemplo4 {
    public static void main(String[] args) {
        int statistic1 = Incomes.AVERAGE.statistics(120000,3210000,2400000);
        System.out.println("This is the average income in those 3 months: "+statistic1+"$ . \n========================");

        int statistic2 = Incomes.PLUS.statistics(3200123,4329990,1230000);
        System.out.println("This is the total income of the 3 months: "+statistic2+"$ .");
    }
}
