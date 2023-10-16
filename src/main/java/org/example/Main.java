package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanNumeral RomNum = new RomanNumeral();
        String romanInput = "";
//        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the Roman Numeral to be converted: ");
            romanInput = s.nextLine();
            System.out.println("The integer value is: " + RomNum.romanToInt(romanInput));
//        } catch (Exception e){
//            System.out.println("Invalid Roman Numeral");
//        }
    }
}
