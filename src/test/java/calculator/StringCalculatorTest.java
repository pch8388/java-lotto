package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

  @DisplayName("숫자하나만 입력")
  @Test
  public void splitAndSumOneNumber() {
    int result = StringCalculator.splitAndSum("1");
    assertThat(result).isEqualTo(1);
  }
}
