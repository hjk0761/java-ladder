package view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

class InputViewTest {

    @DisplayName("interface Reader로부터 받은 String을 List<String>으로 반환한다.")
    @Test
    void stringToListTest() {
        Assertions.assertThat(InputView.readNames(() -> "a,b,c"))
                .isEqualTo(List.of("a", "b", "c"));
    }

    @DisplayName("null 혹은 빈 문자열을 받으면 예외를 발생한다.")
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "\t", "\n"})
    void emptyInputTest(String input) {
        Assertions.assertThatThrownBy(() -> InputView.readNames(() -> input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("null 혹은 비 문자열을 입력할 수 없습니다.");
    }

    @DisplayName("쉼표로 구분된 이름이 null 혹은 빈 문자열이면 예외를 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {",b,c", "a,,c", "a,b,"})
    void emptyNameTest(String input) {
        Assertions.assertThatThrownBy(() -> InputView.readNames(() -> input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("null 혹은 비 문자열을 입력할 수 없습니다.");
    }

    @DisplayName("공백을 제거한 이름을 반환한다.")
    @Test
    void nameWithSpacesTest() {
        Assertions.assertThat(InputView.readNames(() -> "a , b , c"))
                .isEqualTo(List.of("a", "b", "c"));
    }
}