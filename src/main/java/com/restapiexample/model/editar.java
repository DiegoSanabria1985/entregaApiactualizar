package com.restapiexample.model;

public class editar {

    String status;
    String name;
    String salary;
    String age;
    String id;

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public editar(String status, String name, String salary, String age, String id) {
        this.status = status;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id = id;
    }
}
