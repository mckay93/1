import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] quickSort(int[] arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivot = arr[0];
        int pos = 0;
        
        for(int n : arr){
            if(n > pivot) right.add(n);
            if(n < pivot) left.add(n);
        }
        
        for(int n : left){
            arr[pos++] = n;
        }
        
        arr[pos++] = pivot;
        
        for(int n : right){
            arr[pos++] = n;
        }
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
