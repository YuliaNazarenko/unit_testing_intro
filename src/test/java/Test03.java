import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test03 {

    // Метод, выполняющийся перед каждым тестом
    @BeforeMethod
    public void setup() {
        System.out.println("BeforeMethod: Подготовка к выполнению теста");
    }

    // Метод, выполняющийся после каждого теста
    @AfterMethod
    public void teardown() {
        System.out.println("AfterMethod: Завершение выполнения теста");
    }

    // Первый тест с пояснением
    @Test
    public void testExample1() {
        System.out.println("testExample1: Это первый тест");
        Assert.assertTrue(true, "Условие должно быть истинным");
    }

    // Второй тест с пояснением
    @Test
    public void testExample2() {
        System.out.println("testExample2: Это второй тест");
        Assert.assertFalse(false, "Условие должно быть ложным");
    }

    // Третий тест с пояснением
    @Test
    public void testExample3() {
        System.out.println("testExample3: Это третий тест");
        Assert.assertTrue(5 > 2, "Ожидалось, что 5 больше 2");
    }

    // Четвертый тест с пояснением
    @Test
    public void testExample4() {
        System.out.println("testExample4: Это четвертый тест");
        Assert.assertFalse(2 > 5, "Ожидалось, что 2 не больше 5");
    }

    // Пятый тест с пояснением
    @Test
    public void testExample5() {
        System.out.println("testExample5: Это пятый тест");
        Assert.assertTrue("hello".startsWith("h"), "Строка должна начинаться с 'h'");
    }

    // Тест, отключенный через параметр enabled=false
    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("Этот тест отключен и не будет выполняться");
    }

    // Тест, ожидающий определенное исключение
    @Test(expectedExceptions = ArithmeticException.class)
    public void testWithExpectedException() {
        System.out.println("Этот тест должен выбросить ArithmeticException");
        int result = 1 / 0; // Искусственно вызываем исключение
    }

    // Тест, использующий dependsOnMethods
    @Test(dependsOnMethods = {"testExample1"})
    public void dependentTest() {
        System.out.println("Этот тест выполняется только после testExample1");
        Assert.assertTrue(true, "Зависимый тест выполнен успешно");
    }


    @BeforeTest
    public void beforeTestSetup() {
        System.out.println("BeforeTest: Выполняется перед всеми тестами в текущем <test> блоке");
    }

    @Test
    public void testExample6() {
        System.out.println("testExample6: Это первый тест");
    }

    @Test
    public void testExample7() {
        System.out.println("testExample7: Это второй тест");
    }
}

