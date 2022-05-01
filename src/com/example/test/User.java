package com.example.test;

import javax.jws.WebParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User implements Bank {
    private Model m;
    public User(Model m) {
        this.m = m;
    }
    @Override
    public double showBalance() {
        System.out.print("your acc balance is :");
        return m.balance;
    }
    @Override
    public void credit() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please enter pin");
            int x = Integer.parseInt(bufferedReader.readLine());
            if (x == m.getPin()) {
                System.out.println("Hello.."+m.getName());
                System.out.println("please enter amount");
                int amt = Integer.parseInt(bufferedReader.readLine());
                double b = m.getBalance();
                b = b + amt;
                m.setBalance(b);
                System.out.println("Amount credited successfully.");
                System.out.println("do you want to check your current balance ? enter zero(0) to exit/one(1) to proceed");
                int y= Integer.parseInt(bufferedReader.readLine());
                if(y==1){
                    System.out.println(showBalance());
                }
                else {
                    System.exit(0);
                }
            } else {
                System.out.println("ooops...Wrong pin");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}