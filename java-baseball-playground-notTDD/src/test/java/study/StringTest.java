package study;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    // 1. "1,2"를 ,로 split 하면 1과 2로 잘 분리되는가?
    // 2. "1"을 ,로 split하면 1만 포함하는 배열이 반환되는가?
    @Test
    void split() {
        String[] actual1 = "1,2".split(",");
        assertThat(actual1).contains("1", "2"); // contains() : 값이 포함되어있는지 확인
        assertThat(actual1).containsExactly("1", "2"); // containsExactly() : 포함유무 + 순서까지 확인함

        String[] actual2 = "1".split(",");
        assertThat(actual2).contains("1");
    }

    // "(1,2)"를 substring을 이용하여 괄호를 제거하면 "1,2"만 반환되는가?
    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    // charAt으로 특정 위치의 문자를 가져올 수 있는가?
    @Test
    @DisplayName("charAt() 테스트")
    void charAt1() {
        String str = "abc";
        assertThat(str.charAt(1)).isEqualTo('b');

//        int wrongIndex = 5;
//        // charAt에 문자열의 인덱스를 벗어난 값을 입력했을 때의 예외 처리
//        assertThatThrownBy(() -> {
//            str.charAt(2);
//        }).isInstanceOf(IndexOutOfBoundsException.class)
//            .hasMessageContaining("index:"+wrongIndex+", Size:"+str.length());
    }

    @Test
    void charAt2() {
        // charAt에 문자열의 인덱스를 벗어난 값을 입력했을 때의 예외 처리
        assertThatThrownBy(() -> {
            "abc".charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("index:4, Size:3");
    }

}
