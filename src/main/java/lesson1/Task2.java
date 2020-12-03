package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {
    public static void main(String[] args) {
        String s = "Vitalii";
        System.out.println(getNames(s));
    }




    public static String getNames(String s) {
        String longString = "";
        for (int i = 0; i < 5; i++) {
            longString = longString + s;
            for (int j = 1; j < 10; j++) {
                longString = (longString + " " + s);
            }
            longString = (longString + "\n");
        }
        return longString;
    }


}