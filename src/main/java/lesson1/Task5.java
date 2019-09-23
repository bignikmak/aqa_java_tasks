package lesson1;

import jdk.internal.cmm.SystemResourcePressureImpl;
import org.jetbrains.annotations.NotNull;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {

        String str = "Hello world!!!";
        String r = reverse(str);
        System.out.println(r);
    }

    public static String reverse(String str) {
        if (str.isEmpty()){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
        }
}
