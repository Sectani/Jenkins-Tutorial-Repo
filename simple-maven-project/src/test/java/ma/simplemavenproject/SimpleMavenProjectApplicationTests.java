package ma.simplemavenproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleMavenProjectApplicationTests {

    @Test
    public void testAddition() {
        int result = add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = sub(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void testFactorial() {
        int result = factorial(3);
        assertEquals(6, result);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int factorial(int n) {
        if (n==0 || n==1)
            return 1;
        return factorial(n-1)*n;
    }

}
