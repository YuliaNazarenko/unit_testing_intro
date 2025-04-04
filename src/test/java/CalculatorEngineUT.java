import org.testng.Assert;
import org.testng.annotations.Test;

class CalculatorEngine {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}

public class CalculatorEngineUT {
    @Test (groups = "positive")
    public void testAdd01() {
        int actualResult = CalculatorEngine.add(5, 5);
        int expectedResult = 10;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "special cases")
    public void testAdd02() {
        int actualResult = CalculatorEngine.add(Integer.MAX_VALUE, Integer.MIN_VALUE);
        int expectedResult = -1;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "negative")
    public void testAdd03() {
        int actualResult = CalculatorEngine.mult(10, 5);
        int incorrectResult = 10;

        Assert.assertNotEquals(actualResult, incorrectResult);
    }

    @Test(groups = "positive")
    public void testSub01() {
        int actualResult = CalculatorEngine.sub(3, 3);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "special cases")
    public void testSub02() {
        int actualResult = CalculatorEngine.sub(Integer.MIN_VALUE, Integer.MIN_VALUE);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testSub03() {
        int actualResult = CalculatorEngine.sub(6, 0);
        int expectedResult = 6;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testMult01() {
        int actualResult = CalculatorEngine.mult(5, 2);
        int expectedResult = 10;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testMult02() {
        int actualResult = CalculatorEngine.mult(1, 0);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "special cases")
    public void testMult03() {
        int actualResult = CalculatorEngine.mult(0, 7);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testDiv01() {
        int actualResult = CalculatorEngine.div(20, 5);
        int expectedResult = 4;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "negative")
    public void testDiv02() {
        int actualResult = CalculatorEngine.div(10, 5);
        int incorrectResult = 50;

        Assert.assertNotEquals(actualResult, incorrectResult);
    }

    @Test(groups = "special cases")
    public void testDiv03() {
        try {
            int actualResult = CalculatorEngine.div(15, 0);
            Assert.fail();
        } catch (ArithmeticException e) {
            Assert.assertTrue(e.getMessage().contains("/ by zero"));
        }
        //or
    }
    @Test(groups = "special cases", expectedExceptions = ArithmeticException.class)
    public void testDiv04() {
            int actualResult = CalculatorEngine.div(10, 0);
    }
}
