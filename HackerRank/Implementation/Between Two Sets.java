import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int counter = 0;
        int lastA = a[a.length - 1];
        int firstB = b[0];
        
        for(int x = lastA; x <= firstB; x++){
            int status = 1;
            for(int oneA : a){
                if(x%oneA != 0){
                    status = 0;
                    break;
                }
            }
            
            if(status == 0) continue;
            
            for(int oneB : b){
                if(oneB%x != 0){
                    status = 0;
                    break;
                }
            }
            if(status == 1) counter++;
        }
        
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
