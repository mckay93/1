import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        boolean isReduced = true;
        
        while(isReduced && s.length() > 0){
            isReduced = false;
            int lastLength = s.length();
            s = s.replaceAll("(\\w)\\1", "");
            if(lastLength != s.length()) isReduced = true;
        }
        
        return s.length() > 0 ? s : "Empty String";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
