

public class Main {

    static String productName;
    static int quantity;
    static double price;
    static int days;

    static double totalSales;
    static double salesByDay;

    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        // Товар 1
        productName = "smartphone";
        quantity = 5;
        price = 2430.68;
        days = 5;

        totalSales = quantity * price;
        salesByDay = totalSales / days;

        System.out.printf(
                "Product No 1: %s,%n" +
                        "total sales for %d days is %s %.2f,%n" +
                        "sales by day is %s %.2f.%n",
                productName, days, CURRENCY, totalSales, CURRENCY, salesByDay
        );

        // Товар 2
        productName = "laptop";
        quantity = 7;
        price = 1498.12;
        days = 7;

        totalSales = quantity * price;
        salesByDay = totalSales / days;

        System.out.printf(
                "Product No 2: %s,%n" +
                        "total sales for %d days is %s %.2f,%n" +
                        "sales by day is %s %.2f.%n",
                productName, days, CURRENCY, totalSales, CURRENCY, salesByDay
        );
    }
}
