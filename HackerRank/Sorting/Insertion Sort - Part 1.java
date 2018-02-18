import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort1(int n, int[] arr) {
        int tmp = arr[arr.length-1];
        
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] > tmp){
                arr[i+1] = arr[i];
                System.out.println(Arrays.toString(arr).replaceAll("[\\]\\[\\,]", ""));
                if(i == 0){
                    arr[i] = tmp;
                    System.out.println(Arrays.toString(arr).replaceAll("[\\]\\[\\,]", ""));
                }
            } else {
                arr[i+1] = tmp;
                System.out.println(Arrays.toString(arr).replaceAll("[\\]\\[\\,]", ""));
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
