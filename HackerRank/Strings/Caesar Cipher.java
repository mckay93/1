import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        String result = "";
        
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(String.valueOf(letter).matches("[\\W\\d_]")){
                result += letter;
            }else{
                int step = k > 26 ? k%26 : k;
                if(letter <= 90){
                    step = letter + step > 90 ? (letter + step) - 90 : (letter - 64) + step;
                    result += (char)(64 + step);
                }else{
                    step = letter + step > 122 ? (letter + step) - 122 : (letter - 96) + step;
                    result += (char)(96 + step);
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}
