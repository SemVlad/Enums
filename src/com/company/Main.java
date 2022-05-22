package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User userOne = new User("logIn1", "121", "Vasya", EmployeePosition.ANONYM);
        User userTwo = new User("logIn2", "122", "Kolya", EmployeePosition.DIRECTOR);
        User userThree = new User("logIn3", "123", "Vlad", EmployeePosition.ADMIN);
        User userFour = new User("logIn4", "124", "Vova", EmployeePosition.MANAGER);
        User userFive = new User("logIn5", "125", "Tanya", EmployeePosition.COUSTOMER);

        // создаем магаз
        Store store = new Store();
        store.setUser(new User[]{userOne, userTwo, userThree, userFour, userFive});
        store.setUrl("atb.com");
        store.setName("ATB");

        // бесконечный цикл
        while (true) {
            tryLog(store);
        }
    }

    public static void tryLog(Store store) {

        System.out.println("Введите логин: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        if (store.login(login, password)) {
            store.getCurrentUserRights();
            // System.out.println("отримані дані такого чувака");
            store.logout();
        } else {
            System.out.println("Неверный логин и/или пароль");
        }
    }
}