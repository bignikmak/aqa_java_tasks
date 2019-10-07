package test.lesson1;

import main.java.lesson1.Task2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class Task2Test {
    private Task2 nam;

    @BeforeClass(description = "Before class")
    public void setUp() {
        nam = new Task2();
        System.out.println("Before class");
    }

    @Test
    public void TestNameDisplay() {
        String name = "Nick";
        String s = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                s += name + " ";
            }
            s += "\n";
        }
        assertEquals(s, nam.nDis());
    }

    @Test
    public void Test2NameDisplay() {
        String name = "Nick";
        String s = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                s += name + " ";
            }
            s += "\n";
        }
        assertNotEquals(s, nam.nDis());
    }

    @Test
    public void Test3NameDisplay() {
        assertEquals(255, nam.nDis().length());
    }
}
