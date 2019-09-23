package lesson1;

public class Task1 {
    /* Минимум трех чисел
    Написать функцию, которая вычисляет минимум из трёх чисел.
    */

    public static void main(String[] args) {
    }

    public static int min(int a, int b, int c) {
        int min;
        if ((a < b) && (a < c))
            min = a;
         else if ((b < a) && ( b < c))
            min = b;
         else
             min =c;
        return min;
    }
}