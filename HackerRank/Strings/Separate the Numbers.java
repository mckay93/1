import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void separateNumbers(String s) {
        Long first;
        String testString;
        
        for(int i = 1; i <= s.length() / 2; i++){
            Long tmpFirst = Long.parseLong(s.substring(0, i));
            first = tmpFirst;
            testString = String.valueOf(tmpFirst);
            
            while(testString.length() < s.length()){
                testString += String.valueOf(++tmpFirst);
            }

            if(testString.equals(s)){
                System.out.println("YES " + first);
                return;
            }
        }
        
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}
