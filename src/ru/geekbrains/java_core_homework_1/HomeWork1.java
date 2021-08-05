package ru.geekbrains.java_core_homework_1;

/*
    Курс Java Core. Домашнее задание № 1
 */
public class HomeWork1 {
    // 1. Прописываем метод main()
    public static void main(String[] args) {
        // 2. Создаём переменные всех пройденных типов данных
        byte byteVal = 30;
        short shortVal = 50;
        int intVal = 100;
        long longVal = 1000L;
        float floatVal = 3.14F;
        double doubleVal = 4.75;
        char charVal = 'D';
        boolean booleanVal = true;
        String stringVal = "Содержание переменной строкового типа";
        System.out.println("Переменная типа byte = " + byteVal);
        System.out.println("Переменная типа short = " + shortVal);
        System.out.println("Переменная типа int = " + intVal);
        System.out.println("Переменная типа long = " + longVal);
        System.out.println("Переменная типа float = " + floatVal);
        System.out.println("Переменная типа double = " + doubleVal);
        System.out.println("Переменная типа char = " + charVal);
        System.out.println("Переменная типа boolean = " + booleanVal);
        System.out.println("Переменная типа string = " + stringVal);
        System.out.println("12 * (6 + (18 / 9)) = " + calculate(12, 5,18,9)); // Вызов метода из задания 3, передача в него целочисленных аргументов и вывод результата в консоль
        System.out.println("Лежит ли сумма 4 + 12 в пределах от 10 до 20: " + checkSum(4, 12)); // Вызов метода из задания 4 и определение того, лежит ли сумма двух чисел в пределах от 10 до 20
        System.out.println("Лежит ли сумма 14 + 17 в пределах от 10 до 20: " + checkSum(14, 17)); // Вызов метода из задания 4 и определение того, лежит ли сумма двух чисел в пределах от 10 до 20
        isValPos(12); // Вызов метода из задания 5, проверка на положительность
        isValPos(-3); // Вызов метода из задания 5, проверка на отрицательность
        System.out.println("Является ли число 23 отрицательным? Ответ: " + isValPosBool(23)); // Вызов метода из задания 6, проверяющего, является ли число отрицательным
        System.out.println("Является ли число -74 отрицательным? Ответ: " + isValPosBool(-74)); // Вызов метода из задания 6, проверяющего, является ли число отрицательным
        helloName("Максим"); // Вызов метода из задания 7, выводящего приветственное сообщение
        System.out.println("Является ли 2019 год високосным:");
        checkYear(2019); // Проверка 2019 года на високосность
        System.out.println("Является ли 2020 год високосным:");
        checkYear(2020); // Проверка 2020 года на високосность
    }
    // 3. Создание метода, вычисляющего выражение a * (b + (c / d)) и возвращающего результат
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    // 4. Создание метода, принимающего на вход два целых числа и проверяющего, что их сумма лежит в пределах от 10 до 20
    public static boolean checkSum(int valA, int valB) {
        int sum2Val = valA + valB;
        if (sum2Val >= 10 && sum2Val <= 20) {
            return true;
        }
            return false;

    }
    // 5. Создание метода, определяющего, является ли число положительным или отрицательным, и печатающего результат в консоль
    public static void isValPos(int a) {
        if (a >= 0) {
            System.out.println(a + " - число положительное");
        } else {
            System.out.println(a + " - число отрицательное");
        }
    }
    // 6. Создание метода, определяющего, является ли число положительным или отрицательным, и возвращающего true или false
    public static boolean isValPosBool(int a) {
        if (a >= 0) {
            return false;
        }
            return true;

    }
    // 7. Создание метода, принимающего имя и выдающего приветственное сообщение
    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }
    // 8. Создание метода, проверяющего год на високосность
    public static void checkYear(int year) {
        if (year % 4 == 0) { // Проверка, делится ли год без остатка на 4
            if (year % 100 == 0) { // Проверка, делится ли год без остатка на 100
                if (year % 400 == 0) { // Проверка, делится ли год без остатка на 400
                    System.out.println("Год високосный"); // Если год делится без остатка на 400, то он високосный
                } else {
                    System.out.println("Год не високосный"); // Если год не делится без остатка на 400, то он не високосный
                }
            } else {
                System.out.println("Год високосный"); // Если год не делится без остатка на 100, то он високосный
            }
        } else {
            System.out.println("Год не високосный"); // Если год не делится без остатка на 4, то он не високосный
        }
    }
}