package com.example.test;

public class Model {
    public long id;
    public String name;
    public double balance;
    public int pin;
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
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public Model(long id, String name, double balance, int pin) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.pin=pin;
    }
    public Model() {
        super();
    }
    @Override
    public String toString() {
        return "{" +
                "Cust_id=" + id +
                ", Cust_name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}