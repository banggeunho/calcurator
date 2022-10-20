package gcukakao.jenkins.calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalTest {
    private Calculator calculator = new Calculator();
    @DisplayName("더하기")
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @DisplayName("빼기")
    @Test
    public void testSub() {assertEquals(1, calculator.sub(3, 2));}

    @DisplayName("곱하기")
    @Test
    public void testMul() { assertEquals(10, calculator.mul(2, 5));}

    @DisplayName("나누기")
    @Test
    public void testDiv() { assertEquals(6, calculator.div(12,2));}
}
