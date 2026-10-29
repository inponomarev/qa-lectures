package ru.inponomarev.qa.example1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingIsHelloWorld() {
        assertEquals("Hello, World!", App.greeting());
    }
}
