package com.example.test;

import java.io.IOException;

public interface Bank {
    Model createUser();
    Model doTransaction(double amt) throws IOException;
}