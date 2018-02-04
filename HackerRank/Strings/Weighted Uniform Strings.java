import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static Set<Integer> getWeights(String s){
        Set<Integer> weights = new HashSet<Integer>();
        char last = 0;
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            sum += Math.abs(96 - s.charAt(i));
            
            if(i < s.length() - 1){
                if(s.charAt(i) != s.charAt(i+1)){
                    weights.add(sum);
                    sum = 0;
                }else{
                    weights.add(sum);
                }
            }else{
                weights.add(sum);
            }
            /*if(last != s.charAt(i)){
                last = s.charAt(i);
                if(sum > 0){
                    sum += Math.abs(96 - s.charAt(i-1));
                    weights.add(sum);
                    sum = 0;
                }
                weights.add(Math.abs(96 - s.charAt(i)));  
            }else{
                sum += Math.abs(96 - s.charAt(i-1));
                weights.add(sum);
                if(i == s.length()-1){
                    sum += Math.abs(96 - s.charAt(i));
                    weights.add(sum);
                }
            }*/
        }
        
        return weights;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        Set<Integer> weights = getWeights(s);
        
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(weights.contains(x)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
