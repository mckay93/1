import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String hhmmss[] = s.split(":");
        String hh = hhmmss[0];
        String mm = hhmmss[1];
        String ss = hhmmss[2].substring(0,2);
        
        if(hhmmss[2].contains("AM")){
            if(hh.equals("12")) return "00:" + mm + ":" + ss;
            else return hh + ":" + mm + ":" + ss;
        }else{
            if(hh.equals("12")) return hh + ":" + mm + ":" + ss;
            else return (Integer.parseInt(hh) + 12) + ":" + mm + ":" + ss;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
