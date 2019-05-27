import java.util.Scanner;

public class hw4_2 {

    /**
     * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
     * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим: Например:
     * CM == 900.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку римских чисел");
        String str = scan.nextLine();

        System.out.println(checkingNum(str));
    }

    public static int checkingNum(String str) {
        int num = 0;
        String f = " ";
        str = str + f;
        char s;
        int lf = str.length();
        for (int i = 0; i < lf - 1; ++i) {

            if ((searchNum(str.charAt(i)) < searchNum(str.charAt(i + 1)))) {
                num += searchNum(str.charAt(i + 1)) - searchNum(str.charAt(i));
                i++;

            } else {
                num += searchNum(str.charAt(i));
            }
        }
        return num;
    }

    public static int searchNum(char s) {
        int d = 0;
        switch (s) {
            case 'M': d += 1000;
                break;

            case 'D': d += 500;
                break;

            case 'C': d += 100;
                break;

            case 'L': d += 50;
                break;

            case 'X': d += 10;
                break;

            case 'V': d += 5;
                break;

            case 'I': d += 1;
                break;
            case ' ': d += 0;
        }
        return d;
    }
}
