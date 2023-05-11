package net.codejava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AnnotationTest {

	
	 @Test
	    void helloJUnit5() {
	        assertEquals(10, 5+5);
	    }
	 
	 @ParameterizedTest
	    @ValueSource(strings = { "cali", "bali", "dani" })
	    void endsWithI(String str) {
	        assertTrue(str.endsWith("i"));
	    }
	 
	  @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	    @DisplayName("RepeatingTest")
	    void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) {
	        int i = 3;
	        System.out.println(testInfo.getDisplayName() + 
	            "-->" + repInfo.getCurrentRepetition()
	        );
	        
	        assertEquals(repInfo.getCurrentRepetition(), i);
	    }
	  
	  @Test
	    @DisplayName("Custom test name")
	    void testWithDisplayName() {
	    }
	
}
