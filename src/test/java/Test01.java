import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {

        @Test
        public void testDemo01() {

            Assert.assertEquals(2 + 2, 4);
        }

        @Test
        public void testSe01() {
            Assert.assertTrue(true);
        }
}
