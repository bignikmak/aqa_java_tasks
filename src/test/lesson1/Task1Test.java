package test.lesson1;

import lesson1.Task1;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class Task1Test {
    static Task1 abc;

    @BeforeClass (description = "Before class")
    static void setUp() {
        abc = new Task1();
        System.out.println("Before class");
    }

    @Test(dataProvider = "ProviderForMin")
    public static void testMin(int a[], int expected){
        int actual = abc.min(a);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "ProviderForMin")
    public Object[][] ProviderForMin() {
        return new Object[][] {
                {new int[]{2, 3, 5}, 2},
                {new int[]{15, 16, 17}, 15},
                {new int[]{11, 22, 33}, 11},
                {new int[]{8, 12, 20}, 8},
                {new int[]{1, 10000, 0}, 0}
        };
    }
}
