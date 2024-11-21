package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double num1 = 0, num2 = 0;
        String operation;

        try {
            // Перше число у користувача
            System.out.print("Введіть перше число: ");
            num1 = Double.parseDouble(scanner.nextLine());

            // Друге число у користувача
            System.out.print("Введіть друге число: ");
            num2 = Double.parseDouble(scanner.nextLine());

            // Операція, яку користувач хоче виконати
            System.out.print("Введіть операцію (+, -, *, /, sqrt): ");
            operation = scanner.nextLine();

            double result = 0;

            // Вибір операції на основі вводу користувача
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                case "sqrt":
                    // Для квадратного кореня потрібне лише одне число
                    result = calculator.sqrt(num1);
                    break;
                default:
                    System.out.println("Невідома операція");
                    return;
            }

            // Виводжу результат операції
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            // Ділення на нуль
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            // Виключення для некоректних вхідних даних
            System.out.println("Помилка: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Виключення при некоректному введенні числа
            System.out.println("Помилка: Введено некоректне число");
        } catch (Exception e) {
            // Обробка різних інших невідомих виключень
            System.out.println("Сталася невідома помилка");
        } finally {
            // Виводжу повідомленя про авершення обробки запиту
            System.out.println("Завершення обробки запиту");
        }

        scanner.close();
    }
}
