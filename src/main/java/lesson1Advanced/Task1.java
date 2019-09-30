package lesson1Advanced;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 1;
        int e = 90;
        int f = 2;
        int g = 0;
        System.out.println(min(a, b, c, d, e, f, g));
        System.out.println(min2(a, b, c));
    }

    public static int min(int a, int b, int c, int d, int e, int f, int g) {
        int[] ar = {a, b, c, d, e, f, g};
        Arrays.sort(ar);
        return ar[0];
    }

    public static int min2(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    }
}