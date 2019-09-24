package lesson1;

public class Task1 {

    public static void main(String[] args) {
        int m3;
        int a = 10;
        int b = 7;
        int c = 5;
        m3 = min(a, b, c);
        System.out.println(m3);
    }

        public static int min(int a, int b, int c) {
            if ((a < b) && (a < c))
                return a;
            else if ((b < a) && (b < c))
                return b;
            else
                return c;
        }
}