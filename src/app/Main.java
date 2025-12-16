

public class Main {
    public static void main(String[] args) {

        // Всі змінні для замоілення
        int orderNo;
        String client;
        String product;
        double price;
        String address;

        // Замовлення номер 1
        orderNo   = 1;
        client    = "Alice";
        product   = "smartphone";
        price     = 305.99;
        address   = "Moon Street, 10";

        System.out.println(
                "Order No " + orderNo + " Client: " + client + "\n" +
                        "Product: " + product + "\n" +
                        "price EUR " + price + "\n" +
                        "Address: " + address + "."
        );

        // Замовлення номер 2
        orderNo   = 2;
        client    = "Tom";
        product   = "laptop";
        price     = 570.95;
        address   = "Terra Street, 17";

        System.out.println(
                "Order No " + orderNo + " Client: " + client + "\n" +
                        "Product: " + product + "\n" +
                        "price EUR " + price + "\n" +
                        "Address: " + address + "."
        );
    }
}
