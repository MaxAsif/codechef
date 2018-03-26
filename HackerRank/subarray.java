import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int t=0;
        
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s = s + a[j];
                if(s<0){
                   
                   t++;
                }
                
            }
        }
        System.out.println(t);
    }
}