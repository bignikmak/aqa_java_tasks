package test.lesson1;

import lesson1.Task2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


public class Task2Test {
    static Task2 name;

    @BeforeClass(description = "Before class")
    static void setUp() {
        name = new Task2();
        System.out.println("Before class");
    }

    @Test
    public static void TestVertNameDisplay() {
        String act[] = name.nameDisplay().split("\n");
        int expected = 4;
        assertEquals(act.length, expected);
    }

    @Test
    public static void TestHorNameDisplay() {
        String act[] = name.nameDisplay().split("\n");
        int expected2 = 10;
        for(int i = 0; i < act.length; i++) {
            int act2 = act[i].split(" ").length;
            assertEquals(act2, expected2, "Not assert expected value" + expected2);
        }
    }

}



