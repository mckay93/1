import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int birdTypes[] = new int[5];  
        int commonType = -1;
        
        for(int bird : ar) birdTypes[bird-1]++;
        
        for(int i = 0; i < birdTypes.length; i++){
            if(commonType == -1){
                commonType = i;
                continue;
            }
            if(birdTypes[i] > birdTypes[commonType]) commonType = i;
        }
        
        return commonType + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
