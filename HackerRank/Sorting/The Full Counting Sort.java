import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void showArray(StringBuilder str[]){
        for(StringBuilder s : str) {
            if(s != null) System.out.print(s);
        }
        
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        StringBuilder str[];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        str = new StringBuilder[n];
        
        for(int i = 0; i < n; i++){
            String values[] = in.readLine().split(" ");
            int x = Integer.parseInt(values[0]);
            String s = values[1];
            if(str[x] == null) str[x] = new StringBuilder();
            
            if(i < n/2){
                str[x].append("- ");
            }else{
                str[x].append(s + " ");
            }
        }
        
        showArray(str);
        
        in.close();
    }
}
