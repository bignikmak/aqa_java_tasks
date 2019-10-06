package lesson1;

public class Task1 {
    public Task1() {
    }

    public int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = a[i] < min ? a[i] : min;
        }
        return min;
    }
}