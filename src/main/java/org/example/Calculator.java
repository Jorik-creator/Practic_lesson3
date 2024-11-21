package org.example;

// Клас Calculator з базовими арифметичними операціями
public class Calculator {

    // Метод додавання двох чисел
    public double add(double a, double b) {
        return a + b;
    }

    // Метод віднімання двох чисел
    public double subtract(double a, double b) {
        return a - b;
    }

    // Метод множення двох чисел
    public double multiply(double a, double b) {
        return a * b;
    }

    // Метод ділення двох чисел та обробкою виключення при діленні на нульь
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            // Виключеня при спробі ділення на нуль
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return a / b;
    }

    // Метод обчислення кореня з перевіркою вхідних даних
    public double sqrt(double a) throws InvalidInputException {
        if (a < 0) {
            // Виключення при від'ємному числі
            throw new InvalidInputException("Неможливо обчислити квадратний корінь з від'ємного числа");
        }
        return Math.sqrt(a);
    }
}

