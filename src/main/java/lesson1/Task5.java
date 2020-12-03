package lesson1;

// Вхідне слово віддзеркалюємо. Розбиваємо вхідне та вихідне слова на массиви.


public class Task5 {
    public static void main(String[] args) {
        System.out.println(main("Hello"));
    }
   public static String main(String str) {


        int leng = str.length();
        String rev = "";
        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;



    }
}
