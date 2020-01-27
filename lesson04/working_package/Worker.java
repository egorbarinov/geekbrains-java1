package ru.geekbrains.lesson_d.hw.working_package;

public class Worker {
    private String fullName;
    private String post;
    private String telephone;
    private int salary;
    private int age;

    public Worker(String fullName, String post, String telephone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }
    public String getPost() {
        return post;
    }
    public String getTelephone() {
        return telephone;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    public void outputPull() {
        System.out.println(fullName + " " + post + " " + salary);
    }

}





