import java.util.Scanner;

public class MethodsExample {

    // 1. Метод для виведення квадрата числа
    public static void printSquare(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");
    }

    // 2. Метод для обчислення об'єму циліндра
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 3. Метод для обчислення суми елементів масиву
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    // 4. Метод для зворотного рядка
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // 5. Метод для піднесення до степеня
    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    // 6. Метод для виведення тексту n разів
    public static void printTextMultipleTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    // Головний метод для демонстрації
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Квадрат числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        // 2. Об'єм циліндра
        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // 3. Сума елементів масиву
        int[] array = {10, 20, 30, 40, 50};
        System.out.print("Масив чисел: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        int sum = sumArray(array);
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        // 4. Зворотний рядок
        scanner.nextLine(); // очищаємо буфер після nextInt/nextDouble
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();
        String reversed = reverseString(text);
        System.out.println("Рядок в зворотньому порядку: " + reversed);

        // 5. Піднесення до степеня
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int powerResult = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");

        // 6. Виведення тексту n разів
        scanner.nextLine(); // очищаємо буфер
        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // очищаємо буфер
        System.out.print("Введіть текстовий рядок: ");
        String multiText = scanner.nextLine();
        printTextMultipleTimes(n, multiText);

        scanner.close();
    }
}