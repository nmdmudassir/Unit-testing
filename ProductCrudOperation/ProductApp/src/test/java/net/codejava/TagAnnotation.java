package net.codejava;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("smoke")
public class TagAnnotation {

    @Test
    @Tag("login")
    void validLoginTest() {
    }

    @Test
    @Tag("search")
    void searchTest() {
    }
}
