package com.example.test;

public class Model {
    public long id;
    public String name;
    public double balance;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Model(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Model() {
        super();
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}