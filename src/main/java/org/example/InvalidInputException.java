package org.example;

// Це клас для користувацького виключення некоректних вхідних даних
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
