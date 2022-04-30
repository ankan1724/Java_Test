package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User1 implements Bank {
    Model m = new Model();

    @Override
    public Model createUser() {
        m.setId(11235813);
        m.setName("Ankan");
        m.setBalance(7000.00);
        return m;
    }

    @Override
    public Model doTransaction(double amt) {
        double b = m.getBalance();
        b = b + amt;
        m.setBalance(b);
        return m;
    }
}