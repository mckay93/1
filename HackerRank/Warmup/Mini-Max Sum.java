import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long sum = Arrays.stream(arr).asLongStream().sum();
        
        long min = Long.MAX_VALUE;
        long max = 0;
        
        for(int i = 0; i < arr.length; i++){
            long sumOfFour = sum - arr[i];
            if(sumOfFour > max) max = sumOfFour;
            if(sumOfFour < min) min = sumOfFour;
        }
        
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
