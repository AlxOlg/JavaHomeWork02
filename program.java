package JavaHomeWork02;

/**
 * Проверить, является ли строка палиндромом.
 */

import java.util.Scanner;

/**
 * program
 */
public class program {

    static boolean isPalindrome(String source) {
    for (int i = 0; i <= source.length() / 2; i++) {
        if (source.charAt(i) != source.charAt(source.length() - i - 1)) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Строка: ");
        String str = scan.nextLine();
        System.out.println(isPalindrome(str));
        scan.close();
    }
}
