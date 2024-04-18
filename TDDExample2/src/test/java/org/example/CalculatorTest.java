//  Name           ; muhammed elselemi
//  student number ; B201202555
//  course name    ; software validation and verification
//  homework info  ; homework number 1
//  reopsitory link; https://github.com/MUHAMMED-ELSELEMI/clculator-test


package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({"10, 2, 5", "10, 4, 2.5", "12.5, 2.5, 5", "10, 2.5, 4", "12.5, 5, 2.5"})
    void testDivision(float divided, float divisor, float expected) {
        assertEquals(expected, Calculator.divide(divided, divisor));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5f, 0),
                "IllegalArgumentException expected."
        );

        // Optional. To check whether the error messages match.
        assertEquals("Illegal Argument Exception.", exception.getMessage());
    }
}

