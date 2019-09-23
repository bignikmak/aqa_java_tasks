package lesson1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse());
    }
   public static String reverse () {
       String str = "Hello world!!!";
       String res = " ";
       int L = str.length();
       for (int i = 0; i < L; i++) {
           res = str.charAt(i) + res;
       }
       return res;
    }
}
