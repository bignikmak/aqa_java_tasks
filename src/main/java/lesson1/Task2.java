package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

import com.sun.media.sound.SoftAudioPusher;

public class Task2 {

    public static void main(String[] args) {
        String s = "Nick";
        for (int i = 0; i < 5; i++) {
            System.out.print(s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " ");
            System.out.println(s);
        }
    }
}