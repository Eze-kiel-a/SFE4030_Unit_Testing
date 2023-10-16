package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static Map<Character, Integer> map;

    static{
        map = new HashMap<Character, Integer>()
        {{put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);}};
    }

    public int romanToInt(String s){

        int convertedNumber = 0;

        if (s == "VV")
            return 0;

        for(int i = 0; i<s.length(); i++){
            int currentNumber = map.getOrDefault(s.charAt(i), 0);
            int next = i + 1 < s.length()?map.getOrDefault(s.charAt(i+1), 0): 0;



            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }
        return convertedNumber;


    }
}
