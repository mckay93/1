import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String checkText(String s){
        int counter = 0;
        Pattern pattern = Pattern.compile("([a-z])(?!.*\\1)");
        Matcher matcher = pattern.matcher(s.toLowerCase());
        while(matcher.find()) counter++;
        return counter == 26 ? "pangram" : "not pangram";
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        if(txt.length() < 1 || txt.length() > 1000) throw new Exception();
        System.out.println(checkText(txt));
    }
}
