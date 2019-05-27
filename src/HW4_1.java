import java.util.Scanner;

public class HW4_1 {

    /**
     * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();

        System.out.println(stringPolindrom(str));
    }

    private static boolean stringPolindrom(String str) {
        int a = str.length();
        boolean b = false;
        for (int i = 0; i < (a / 2); i++) {
            if (str.charAt(i) != str.charAt(a - i - 1)) {
                b = false;
            } else {
                b = true;
                break;
            }
        }
        return b;
    }

}
