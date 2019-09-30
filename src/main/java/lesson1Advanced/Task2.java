package lesson1Advanced;

public class Task2 {

    public static void main(String[] args) {
        String s = "*";
        int l = 9;
        for (int i = 0; i <= l; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(s);
            }
                System.out.println(s);
        }
    }
}