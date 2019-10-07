package main.java.lesson1;

public class Task2 {

        public static String nDis() {
            String name = "Nick";
            String str = "";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 10; j++) {
                    str += name + " ";
                }
                str += "\n";
            }
            return str;
        }
}