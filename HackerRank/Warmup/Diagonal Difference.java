import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        
        for(int i = 0, j = a.length - 1; i < a.length; i++, j--){
            leftDiagonalSum += a[i][i];
            rightDiagonalSum += a[i][j];
        }
        
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
