package Manipulations;

import java.util.Scanner;

public class CountNumberofVowels {

    public static void main(String[] args) {

        int vowels = 0, digits = 0, blanks = 0;
        char ch;

        System.out.println("Please enter a String");
        Scanner in = new Scanner(System.in);
        String testString = in.nextLine();

        for (int i = 0; i < testString.length(); i++) {

            ch = testString.charAt(i);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                vowels++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                blanks++;
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Digits : " + digits);
        System.out.println("Blanks : " + blanks);

    }

}
