package lesson1Advanced;

public class Task1 {
    public static void main(String[] args) {
        int[] ar = {2, 4, 6, 1, 90, 2, 0};
        int a = 2;
        int b = 4;
        int c = 6;

        System.out.println(min(ar));
        System.out.println(min(a, b, c));
    }

    public static int min(int[] ar) {
        int min = ar[0];
            for (int i = 0; i < ar.length; i++) {
                min = ar[i] < min ? ar[i] : min;
            }
            return min;
    }

    public static int min(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
    }
}