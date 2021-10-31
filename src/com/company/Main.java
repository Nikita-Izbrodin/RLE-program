package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letters:");
        String userInput;
        userInput = input.next();

        System.out.println(userInput);

        int compressionCount = 0;

        char lastLetter = userInput.charAt(0);
        String compressedString = "";

        for (int i=0; i < userInput.length(); i++) {
            char letter = userInput.charAt(i);
            if (letter != lastLetter) {
                //System.out.print(lastLetter);
                //System.out.print(compressionCount);
                compressedString = compressedString + lastLetter + compressionCount;
                compressionCount = 1;
                lastLetter = letter;
            } else {
                compressionCount += 1;
            }
        }
        compressedString = compressedString + lastLetter + compressionCount;
        System.out.println(compressedString);

        System.out.println("Input length: " + userInput.length());
        System.out.println("Output length: " + compressedString.length());

        int spaceSaved = userInput.length() - compressedString.length();
        System.out.println("Space saved: " + spaceSaved);
    }
}