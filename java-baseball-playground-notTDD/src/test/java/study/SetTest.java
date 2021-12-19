package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    // Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습테스트를 구현
    @Test
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    // Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습테스트를 구현
    // JUnit의 ParameterizedTest를 활용해 중복 코드를 제거
    // ValueSource를 통해 반복하면서 넣어줄 파라미터 입력
    @ParameterizedTest
    @ValueSource(ints= {1, 2, 3})
    void contains1(int i) {
        assertThat(numbers.contains(i)).isTrue();
    }

    // CsvSource를 통해 false값도 반환해야함
    @ParameterizedTest
    @CsvSource(value= {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void contains2(int i, boolean expected) {
        assertThat(numbers.contains(i)).isEqualTo(expected);
    }
}
