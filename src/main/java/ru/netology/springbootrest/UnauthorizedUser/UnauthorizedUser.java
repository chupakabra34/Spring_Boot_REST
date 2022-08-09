package ru.netology.springbootrest.UnauthorizedUser;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}