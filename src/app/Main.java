package app;

public class Main {

    public static void main(String[] args) {
        // Фіксована матриця 4x4, як у прикладі
        int[][] matrix = {
                {23, 45, 12, 37},
                {50, 11, 42, 20},
                {33, 27, 19, 48},
                {8,  39, 6,  4 }
        };

        int size = matrix.length; // Розмір матриці

        // Виводимо матрицю у вигляді таблиці
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // %4d вирівнює числа по ширині 4 символи для вигляду
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка матриці
        }

        // Обчислення сум парних та непарних рядків
        int sumEvenRows = 0; // сума рядків 0 та 2
        int sumOddRows = 0;  // сума рядків 1 та 3

        for (int i = 0; i < size; i++) {
            int rowSum = 0; // сума поточного рядка
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j]; // додаємо елемент рядка
            }
            // Додаємо до відповідної суми: парні рядки або непарні
            if (i % 2 == 0) sumEvenRows += rowSum;
            else sumOddRows += rowSum;
        }

        // Обчислення добутку парних та непарних стовпців
        long productEvenCols = 1; // добуток стовпців 0 та 2
        long productOddCols = 1;  // добуток стовпців 1 та 3

        for (int j = 0; j < size; j++) {
            long colProduct = 1; // добуток елементів поточного стовпця
            for (int i = 0; i < size; i++) {
                colProduct *= matrix[i][j];
            }
            // Додаємо до відповідного добутку: парні або непарні стовпці
            if (j % 2 == 0) productEvenCols *= colProduct;
            else productOddCols *= colProduct;
        }

        // Вивід результатів сум та добутків

        System.out.println("\nСума елементів у парних рядках (рядки 0,2): " + sumEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядки 1,3): " + sumOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпці 0,2): " + productEvenCols);
        System.out.println("Добуток елементів у непарних стовпцях (стовпці 1,3): " + productOddCols);


        // Перевірка на магічний квадрат

        boolean isMagic = isMagicSquare(matrix);
        if (isMagic) {
            System.out.println("\nМатриця є магічним квадратом.");
        } else {
            System.out.println("\nМатриця не є магічним квадратом.");
        }
    }


    // Метод для перевірки, чи матриця є магічним квадратом.
    // Магічний квадрат: суми всіх рядків, стовпців та двох діагоналей рівні.
    public static boolean isMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;

        // Обчислюємо суму першого рядка для порівняння
        for (int j = 0; j < size; j++) {
            magicSum += matrix[0][j];
        }

        // Перевірка сум всіх рядків
        for (int i = 1; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) return false; // рядок не збігається ,то не магічний
        }

        // Перевірка сум всіх стовпців
        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) return false; // стовпець не збігається, то не магічний
        }

        // Перевірка головної діагоналі (зліва направо)
        int diag1 = 0;
        for (int i = 0; i < size; i++) {
            diag1 += matrix[i][i];
        }
        if (diag1 != magicSum) return false;

        // Перевірка побічної діагоналі (справа наліво)
        int diag2 = 0;
        for (int i = 0; i < size; i++) {
            diag2 += matrix[i][size - 1 - i];
        }
        if (diag2 != magicSum) return false;

        return true;
    }
}