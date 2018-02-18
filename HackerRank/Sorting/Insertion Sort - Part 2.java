import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort2(int n, int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int x = arr[i];
            int j = i;
            
            while(j > 0 && arr[j-1] > x){
                arr[j] = arr[j-1];
                j--;
            }
            
            arr[j] = x;
            System.out.println(Arrays.toString(arr).replaceAll("[\\]\\[\\,]", ""));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
