package ch_day01;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeDay1 {
    public static void main(String[] args) {
        // drawBox(5);
        // triangle1(5);
        // triangle2(5);
        // triangle3(5);
        // diagonal1(5);
        // diagonal2(5);
        // piramidaInput();
        // box2(9);
        // box2(5);
        // box3(9);
        // box3(5);
        /*int reverse = Reverse(4563);
        System.out.print(reverse);*/
        /*System.out.print(isPalindrome(2003002));*/
        /*System.out.print(Capitalize("this is a very special title"));*/
        /*System.out.print(IsNoDuplicateChar("abcde"));*/
        /*System.out.print(isBrace("((())"));*/
    }

    // Challenge 1-1
    public static void drawBox(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(counter + "  ");
                counter++;
            }
            System.out.println();
        }
    }

    // Challenge 1-2
    public static void triangle1(int n) {
        int counter = 1;
        for (int i = 0; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(counter + "  ");
                    counter++;
            }
                System.out.println();
        }
    }

    // Challenge 1-3
    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    // Challenge 1-4
    public static void triangle3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j){
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Challenge 1-5
    public static void diagonal1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(j + " ");
                } else if (i < j) {
                    System.out.print(10 + " ");
                } else {
                    System.out.print(20 + " ");
                }
            }
            System.out.println();
        }
    }

    // Challenge 1-6
    public static void diagonal2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print((n - i) + " ");
                } else if (i < j) {
                    System.out.print(20 + " ");
                } else {
                    System.out.print(10 + " ");
                }
            }
            System.out.println();
        }
    }

    // Challenge 1-7
    public static void piramidaInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input total baris piramid : ");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Challenge 1-9
    public static void box2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    // Challenge 1-10
    public static void box3(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    if (j%2 == 0) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print("-" + " ");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j%2 != 0) {
                        System.out.print(j + " ");
                    } else {
                        System.out.print("-" + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    // Challenge 2-1
    public static int Reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n/= 10;
        }
        return reversed;
    }

    // Challenge 2-2
    public static boolean isPalindrome(int n) {
        return Reverse(n) == n;
    }

    // Challenge 2-3
    public static String Capitalize(String input) {
        if(input == " " || input == "" || input == null){
            return "";
        }
        input = input.trim();
        StringBuilder cs = new StringBuilder();

        String[] words = input.split(" ");
        for(String word : words){
            cs.append(Character.toTitleCase(word.charAt(0)));
            cs.append(word.substring(1));
            cs.append(" ");
        }
        return cs.toString();
    }

    // Challenge 2-4
    public static boolean IsNoDuplicateChar(String s) {
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    // Challenge 2-5
    public static boolean isBrace(String s) {
        int closed = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '('){
                closed++;
            }else if (c == ')'){
                closed--;
                if (closed < 0){
                    return false;
                }
            }
        }
        return closed == 0;
    }

}