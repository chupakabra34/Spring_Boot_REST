package ru.netology.springbootrest.InvalidCredentials;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}