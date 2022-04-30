package com.example.test;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Bank b=new User1();
        System.out.println(b.createUser());
        System.out.println(b.doTransaction(500));
        
    }
}