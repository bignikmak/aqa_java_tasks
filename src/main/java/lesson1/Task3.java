package lesson1;

public class Task3 {

    public static void main(String[] args) {
        String s = "Nick";
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 9) {
                System.out.print(s + " ");
                j++;
            }
            System.out.println(s);
            i++;
        }
    }
}