package ru.geekbrains;

public class Employee {

    /**
     * ФИО
     */
    private String name;

    /**
     * Должность
     */
    private String position;

    /**
     * email
     */
    private String email;

    /**
     * Телефон
     */
    private String phone;

    /**
     * Зараплата
     */
    private float salary;

    /**
     * Возраст
     */
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + this.name);
        System.out.println("Должность: " + this.position);
        System.out.println("E-mail: " + this.email);
        System.out.println("Телефон: " + this.phone);
        System.out.println("Зарплата: " + this.salary);
        System.out.println("Возраст: " + this.age);
    }
}
