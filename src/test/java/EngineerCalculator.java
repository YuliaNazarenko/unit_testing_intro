import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Math.*;

public class EngineerCalculator extends CalculatorEngine {

    public static double riseToPow(int a, int b) {
        //a - number; n - Nth root
        return pow(a, b);
    }

    public static double findRoot(double a, double n) {
        return pow(a, 1.0 / n);
    }

    @Test(groups = "positive")
    public void testPow01() {
        double actualResult = EngineerCalculator.riseToPow(5, 2);
        double expectedResult = 25;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testPow02() {
        double actualResult = EngineerCalculator.riseToPow(-5, 3);
        double expectedResult = -125;

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "positive")
    public void testPow03() {
        double actualResult = EngineerCalculator.riseToPow(4, -2);
        double expectedResult = 0.0625;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "negative")
    public void testPow04() {
        double actualResult = EngineerCalculator.riseToPow(3, 2);
        double incorrectResult = 6;

        Assert.assertNotEquals(actualResult, incorrectResult);
    }

    @Test(groups = "positive")
    public void testRoot01() {
        double actualResult = EngineerCalculator.findRoot(32, 5);
        double expectedResult = 2;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "positive")
    public void testRoot02() {
        double actualResult = EngineerCalculator.findRoot(25, 2);
        double expectedResult = 5;

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test(groups = "positive")
    public void testRoot03() {
        double actualResult = EngineerCalculator.findRoot(0.0625, -2);
        double expectedResult = 4;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "negative")
    public void testRoot04() {
        double actualResult = EngineerCalculator.findRoot(9, 3);
        double incorrectResult = 3;

        Assert.assertNotEquals(actualResult, incorrectResult);
    }

    @Test(groups = "positive")
    public void testGeneral01() {                            //3^2+(6+6)*(4-3)-4*2*2
        double actualResult = EngineerCalculator.riseToPow(3, 2) + CalculatorEngine.add(6, 6) * CalculatorEngine.sub(4, 3) - CalculatorEngine.mult(4, 2) * EngineerCalculator.findRoot(32, 5);
        double expectedResult = 5;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
