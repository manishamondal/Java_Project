package com.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void main_printsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        try {
            App.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Hello, World!\n", buffer.toString());
    }
}
