import static org.junit.Assert.*;

public class RecursiveFibonacciTest{

    @Test
    public static void FibonacciTest(){
        RecursiveFibonacci tester = new RecursiveFibonacci();
        //test first 20 values of fibonacci
        assertEquals(tester.Fibonacci(0), 0);
        assertEquals(tester.Fibonacci(1), 1);
        assertEquals(tester.Fibonacci(2), 1);
        assertEquals(tester.Fibonacci(3), 2);
        assertEquals(tester.Fibonacci(4), 3);

        assertEquals(tester.Fibonacci(5), 5);
        assertEquals(tester.Fibonacci(6), 8);
        assertEquals(tester.Fibonacci(7), 13);
        assertEquals(tester.Fibonacci(8), 21);
        assertEquals(tester.Fibonacci(9), 34);

        assertEquals(tester.Fibonacci(10), 55);
        assertEquals(tester.Fibonacci(11), 89);
        assertEquals(tester.Fibonacci(12), 144);
        assertEquals(tester.Fibonacci(13), 233);
        assertEquals(tester.Fibonacci(14), 377);

        assertEquals(tester.Fibonacci(15), 610);
        assertEquals(tester.Fibonacci(16), 987);
        assertEquals(tester.Fibonacci(17), 1597);
        assertEquals(tester.Fibonacci(18), 2584);
        assertEquals(tester.Fibonacci(19), 4181);
    }
}