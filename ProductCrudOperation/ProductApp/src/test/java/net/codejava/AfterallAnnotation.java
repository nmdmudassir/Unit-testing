package net.codejava;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class AfterallAnnotation {

	
    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }

    @AfterAll
    static void after() {
        System.out.println("Only run once after all tests");
    }
}
