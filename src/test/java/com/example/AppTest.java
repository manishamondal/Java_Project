package com.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class AppTest {

    @Test
void constructor_covered() {
    App app = new App();
    assertNotNull(app);
}


    @Test
void main_printsHelloWorld() {
    Logger logger = Logger.getLogger(App.class.getName());
    TestLogHandler handler = new TestLogHandler();
    logger.addHandler(handler);

    try {
        App.main(new String[0]);
    } finally {
        logger.removeHandler(handler);
    }

    assertEquals("Hello, World!", handler.lastMessage);
}

private static class TestLogHandler extends Handler {
    String lastMessage;

    @Override
    public void publish(LogRecord logRecord) {
        lastMessage = logRecord.getMessage();
    }

    @Override public void flush() {
        // No buffering, so nothing to flush
    }
    @Override public void close() throws SecurityException {
        // No resources to close
    }
}

}
