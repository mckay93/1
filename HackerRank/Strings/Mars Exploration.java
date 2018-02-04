import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int marsExploration(String s) {
        int counter = 0;
        String sos = "SOS";
        
        for(int i = 0; i < s.length(); i++){
            counter += s.charAt(i) != sos.charAt(i%3) ? 1 : 0;
        }
        
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
