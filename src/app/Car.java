package app;

public class Car {

    // публічний метод
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль запущено!");
    }

    // приховані внутрішні методи
    private void startElectricity() {
        System.out.println("Запущено електрику...");
    }

    private void startCommand() {
        System.out.println("Подано команду на запуск...");
    }

    private void startFuelSystem() {
        System.out.println("Запущено паливну систему...");
    }
}

