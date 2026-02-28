package com.example;

import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.info("App starting");
        LOGGER.info("Hello, World!");
        LOGGER.info("App finished");
    }
}
