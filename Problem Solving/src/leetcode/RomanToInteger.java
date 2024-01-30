package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	
	static public int romanToInt2(String s) {

	        Map<Character, Integer> romanElements = new HashMap<Character, Integer>();
	        romanElements.put('I', 1);
	        romanElements.put('V',5);
	        romanElements.put('X',10);
	        romanElements.put('L',50);
	        romanElements.put('C',100);
	        romanElements.put('D',500);
	        romanElements.put('M',1000);

	        int sum = romanElements.get(s.charAt(s.length() - 1));
	        
	        for(int i = s.length() - 2 ; i >=0 ; i--) {
	            if(romanElements.get(s.charAt(i)) < romanElements.get(s.charAt(i + 1))) {
	                sum -= romanElements.get(s.charAt(i));
	            } else {
	                sum += romanElements.get(s.charAt(i));
	            }
	        }

	        return sum;

	        // int sum = 0;

	        // for(int i = 0; i< s.length() - 1; i++){
	        //     if (romanElements.get(s.charAt(i)) < romanElements.get(s.charAt(i + 1))) {
	        //         sum -= romanElements.get(s.charAt(i));
	        //     } else {
	        //         sum += romanElements.get(s.charAt(i));
	        //     }
	        // }
	        // sum += romanElements.get(s.charAt(s.length() - 1));
	        // return sum;
	    }
	
	
	static int value(char c){
        switch(c){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
        }
        return 0;
    }
	
	static public int romanToInt(String s) {
        
         int sum = 0;

         for(int i = 0; i< s.length() - 1; i++){

             if (value(s.charAt(i)) < value(s.charAt(i + 1))) {
            	 sum -= value(s.charAt(i));
             } else {
            	 sum += value(s.charAt(i));
             }
         }
         sum += value(s.charAt(s.length() - 1));
         return sum;
    }

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));

	}

}
