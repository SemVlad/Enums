package com.company;

public class Store {

    private String name;
    private String url;
    private User[] users;
    private EmployeePosition autorizUser;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public User[] getUser() {
        return users;
    }

    public void setUser(User[] user) {
        this.users = user;
    }

    public EmployeePosition getAutorizUser() {
        return autorizUser;
    }

    public void setAutorizUser(EmployeePosition autorizUser) {
        this.autorizUser = autorizUser;
    }

    // метод логин
                        // правильно ли я передаю в метод данные?
    public boolean login(String name, String password) {            // возможно ошибка в задании логин/ имя

        for (User user : users) {
            if (user.getName().equals(name)) {
                if (user.getPassword().equals(password)) {
                    autorizUser = user.getRole();            // тут наверное надо объект(enum) а не строка
                    return true;      // два одинаковых пункта
                } else {
                    return false;
                }
            }
        }
        return false;           // зачем тут этот возврат?
    }


    // метод текущая должность
    public String getCurrentUserRights() {
        switch (autorizUser) {
            case DIRECTOR:
                return " Директор магазина, может управлять кадрами, и ценами";
            case ADMIN:
                return "Администратор магазина, может добавлять товары и редактировать их описание";
            case MANAGER:
                return "Менеджер магазина, может общаться с клиентами";
            case COUSTOMER:
                return "Клиент магазина, может покупать товары и пользоваться дисконтом";
            case ANONYM:
                return "Анонимный пользователь, может покупать товары и\\или авторизоваться";
        }
        return null;
    }

    // пользователь вішел из системі
    public void logout() {
        setAutorizUser(null);               // setAutorizUser тут надо объкт а не строка???
        System.out.println("Пользователь вышел из системы");
    }

}

