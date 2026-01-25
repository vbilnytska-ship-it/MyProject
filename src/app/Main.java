package app;

public class Main {
    public static void main(String[] args) {

        // створюємо співробітника
        Employee employee = new Employee(
                "Більницька Валерія Володимирівна",
                "Менеджер",
                "valeria@example.com",
                "+380501234567",
                27
        );

        // створюємо авто
        Car car = new Car();
        car.start();
    }
}