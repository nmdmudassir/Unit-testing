package net.codejava;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeallAnnotation {


    @BeforeAll
    static void init() {
        System.out.println("Only run once before all tests");
    }

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }
}
