package leetcode;

public class TwoStringArray {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String result1 = "";
        String result2 = "";

        for(int i = 0; i < word1.length; i++){
            result1 += word1[i];
        }

        for(int i = 0; i < word2.length; i++){
            result2 += word2[i];
        }

        if(result1.equalsIgnoreCase(result2)){
            return true;
        }else{
            return false;
        }
        
    }
   

    public static void main(String[] args){

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.print(arrayStringsAreEqual(word1, word2));
    }
}


























