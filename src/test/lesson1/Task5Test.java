package test.lesson1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Task5Test {
    static lesson1.Task5 rev;

    @BeforeClass(description = "Before class")
    static void setUp() {
        rev = new lesson1.Task5();
        System.out.println("Before class");
    }

    @Test(groups = "Second", dependsOnGroups = "First")
    public static void TestReverseOnFullness () {
        int actual = rev.reverse().length();
        int expected = 14;
        assertEquals(actual, expected, "String length is not " + expected + ", but " + actual);
    }

    @Test(groups = "First")
    public static void TestReverse () {
        String act = rev.reverse();
        String exp = "!!!dlrow olleH";
        assertEquals(act, exp, "String is not reversed, because it is " + act);
    }


}