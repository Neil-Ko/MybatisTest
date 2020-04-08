package com.cool.kai.lambda;

public class Person {
    public String userName;
    public int age;

    public Person() {
    }

    public String getUserName() {
        return userName;
    }

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
