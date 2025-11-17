package org.example;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        palindrome();
    }
    public static void palindrome() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
