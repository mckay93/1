import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        int positivesCount = 0;
        int negativesCount = 0;
        int zerosCount = 0;
        
        for(int n : arr){
            if(n > 0) positivesCount++;
            if(n == 0) zerosCount++;
            if(n < 0) negativesCount++;
        }
        
        System.out.println(positivesCount/(double)arr.length);
        System.out.println(negativesCount/(double)arr.length);
        System.out.println(zerosCount/(double)arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
