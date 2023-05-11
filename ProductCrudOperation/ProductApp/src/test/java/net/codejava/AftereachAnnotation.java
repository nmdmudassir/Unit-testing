package net.codejava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class AftereachAnnotation {

	   @Test
	    void firstTest() {
	        System.out.println(1);
	    }
	    @Test
	    void secondTest() {
	        System.out.println(2);
	    }

	    @AfterEach
	    void after(TestInfo testInfo) {
	        String callingTest = testInfo.getTestMethod().get().getName();
	        System.out.println(callingTest);
	    }
}
