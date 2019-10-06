package lesson1;

public class Task5 {
    public Task5() {
    }

   public String reverse () {
       String str = "Hello world!!!";
       String res = "";
       int L = str.length();
       for (int i = 0; i < L; i++) {
           res = str.charAt(i) + res;
       }
       return res;
    }
}
