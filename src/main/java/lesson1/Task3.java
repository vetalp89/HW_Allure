package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String name = "Vitalii";
        int s = 0;
        while (s<5) {
            int c = 0;
            while (c < 9) {
                System.out.print(name + " ");
                c++;}
            System.out.print(name);
            System.out.println();
            s++;
        }
        //s - строки, с - колонки(стовпчики)
    }
}