package gcukakao.jenkins.calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSub() {assertEquals(3, calculator.sub(3, 2));}

    @Test
    public void testMul() { assertEquals(10, calculator.mul(2, 5));}

    @Test
    public void testDiv() { assertEquals(6, calculator.div(12,2));}
}
