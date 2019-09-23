package lesson1;

public class Task4 {

    public static void main(String[] args) {
        String s = "Nick";
        int i = 0;
        do {
            int j = 0;
                do {
                    System.out.print(s + " ");
                    j++;
                } while (j < 9);
                System.out.println(s);
                i++;
        } while (i < 5);
    }
}