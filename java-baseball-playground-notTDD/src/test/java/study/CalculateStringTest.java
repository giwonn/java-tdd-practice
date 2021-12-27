package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateStringTest {

    CalculateString calculateString;

    @BeforeEach
    void setUp() {
        calculateString = new CalculateString();
    }


    @Test
    void cal() {

        String str = "2 + 3 * 4 / 2";

        int sum = calculateString.calculate(str);

        assertThat(sum).isEqualTo(10);
    }

}
