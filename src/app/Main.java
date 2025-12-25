package app;


public class Main {

    public static void main(String[] args) {

        // Змінна для збереження суми доходу
        double income = 10000;

        // Змінна для збереження суми податку
        double tax;

        // Якщо дохід менший або дорівнює 10000
        // податок становить 2,5%
        if (income <= 10000) {
            tax = income * 0.025;

            // Якщо дохід більший за 10000, але не перевищує 25000
            // податок становить 4,3%
        } else if (income <= 25000) {
            tax = income * 0.043;

            // Якщо дохід більший за 25000
            // податок становить 6,7%
        } else {
            tax = income * 0.067;
        }

        System.out.println("Income = " + income);
        System.out.println("Tax = " + tax);
    }
}