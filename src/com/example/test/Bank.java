package com.example.test;

import java.io.IOException;

public interface Bank {
    double showBalance();
    void credit() throws IOException;
    //Model debit() throws IOException;
}