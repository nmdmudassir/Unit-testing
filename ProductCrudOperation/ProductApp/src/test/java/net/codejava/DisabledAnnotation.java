package net.codejava;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledAnnotation {


    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
