import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int camelcase(String s) {
        int counter = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1).matches("[A-Z]")) counter++;
        }
               
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
