package week01.day04;
import java.util.*;
public class TextTools {
    public static boolean isPalindrome(String input) {
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                cleaned.append(Character.toLowerCase(current));
            }
        }
        int left=0;
        int right=cleaned.length()-1;
        while(left<right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
                left++;
                right--;
        }

        return true;
    }
    public static boolean isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        String first = string1.toLowerCase(); //Normalizes uppercase letters

        int[] freq = new int[26]; //Creates 26 counters
        for(int i=0;i<first.length();i++){
            char letter = first.charAt(i); //Retrieves a character
            int index = letter - 'a'; //Calculates its alphabet index
            freq[index]++; //Increases its frequency
        }
        String second = string2.toLowerCase();
        for(int i=0; i<second.length();i++){
            char letter = second.charAt(i);
            int index =letter-'a';
            freq[index]--;

        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
              }
            }
        return true;
    }


   public static void main(String[] args) {
       System.out.println(isPalindrome("12321"));
        System.out.println(isAnagram("Apple","Pleap"));

    }
}
