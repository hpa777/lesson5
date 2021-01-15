package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	    Employee[] employees = new Employee[] {
	        new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30),
                new Employee("Petrov Petr", "driver", "petr@mail.ru", "+74353534345", 40000, 50),
                new Employee("Sidorov Oleg", "Judge", "sidorov@yandex.ru", "89090543345", 90000, 57),
                new Employee("Egorov Petr", "Doctor", "egor@mail.ru", "+7435453454345", 60000, 35),
                new Employee("Andreev Semen", "Engineer", "Andreev@yandex.ru", "8909543345", 20000, 25),
        };
        for (Employee employee:
             employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }


}
