import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int twoCharaters(String s) {
        Set<String> charsSet = new HashSet<>();
        String chars[];
        int maxLength = 0;
        
        for(int i = 0; i < s.length(); i++) charsSet.add(String.valueOf(s.charAt(i)));
        chars = charsSet.toArray(new String[0]);
        
        for(int i = 0; i < chars.length; i++){
            for(int j = i + 1; j < chars.length; j++){
                boolean isRight = true;
                char last;
                String newS = s;
                
                newS = newS.replaceAll("[^" + chars[i] + chars[j] + "]", "");
                last = newS.charAt(0);
                for(int k = 1; k < newS.length(); k++){
                    if(last == newS.charAt(k)){
                        isRight = false;
                        break;
                    } else {
                        last = newS.charAt(k);
                    }
                }
                if(isRight && newS.length() > maxLength) maxLength = newS.length();
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
