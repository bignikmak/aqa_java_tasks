package lesson1Advanced;

public class Task3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(j < 10 - i ? " " : "*");
            System.out.println();
        }
    }
}