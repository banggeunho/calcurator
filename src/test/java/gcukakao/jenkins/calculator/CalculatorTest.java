package gcukakao.jenkins.calculator; 
import org.junit.Test;

import gcukakao.jenkins.calculator.Calculator;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals; 

@SpringBootTest
public class CalculatorTest { 
     private Calculator calculator = new Calculator();
 
     @Test 
     public void testSum() { 
          assertEquals(5, calculator.sum(2, 3));
     }

     @Test
     public void testSub() {assertEquals(5, calculator.sub(3, 2));}

     @Test
     public void testMul() { assertEquals(10, calculator.mul(2, 5));}

     @Test
     public void testDiv() { assertEquals(6, calculator.div(12,2));}
} 
