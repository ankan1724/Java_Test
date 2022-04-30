package com.example.test;

import java.io.IOException;

public class main { 
    public static void main(String[] args) throws IOException {
        Model m= new Model();
        m.setId(11235813);
        m.setName("Ankan");
        m.setBalance(7000.00);
        m.setPin(1724);
        User user=new User(m);
        user.credit();
        
        
    }
}