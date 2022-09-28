package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String words [] = input.split("\\s+");
        int maxLength = -1;
        String maxWord = "";
        for (String word : words) {
            if (maxLength < word.length()) {
                maxLength = word.length();
                maxWord = word;
            }
        }
        System.out.println("Output:");
        System.out.println(maxWord);
    }
}
