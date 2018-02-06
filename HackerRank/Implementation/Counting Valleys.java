import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int height = 0;
        int valleyCount = 0;
        boolean startOfValley = false;
        
        for(int i = 0; i < s.length(); i++){
            if(startOfValley && s.charAt(i) == 'U' && height + 1 == 0) {
                valleyCount++;
                startOfValley = false;
            }
            if(s.charAt(i) == 'U') height++;
            if(s.charAt(i) == 'D'){
                if(height - 1 < 0) startOfValley = true;
                height--;
            }
        }
        
        return valleyCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
