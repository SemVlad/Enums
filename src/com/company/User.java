package com.company;

public class User {

    private String login;
    private String password;
    private String name;
    private EmployeePosition role = EmployeePosition.ANONYM; //  не совсем понятно зачем п3

    // конструктор
    public User(String login, String password, String name, EmployeePosition role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeePosition getRole() {
        return role;
    }

    public void setRole(EmployeePosition role) {
        this.role = role;
    }
}

