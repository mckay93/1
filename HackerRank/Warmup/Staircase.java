import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        for(int i = n - 1; i >= 0; i--){
            char spaces[] = new char[i];
            char hashKeys[] = new char[n-i];
            Arrays.fill(spaces, ' ');
            Arrays.fill(hashKeys, '#');
            System.out.println(new String(spaces) + new String(hashKeys));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
