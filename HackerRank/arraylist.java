import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
        	int m = sc.nextInt();
        	List<Integer> sub_l = new ArrayList<Integer>(m);
        	for(int j=0;j<m;j++){
        		sub_l.add(sc.nextInt());
        	}
        	l.add(sub_l);
        }
       Iterator<List<Integer>> it = l.iterator();
    /*   while(it.hasNext()){
	       Iterator<Integer> sub_it = it.next().iterator();
	       while(sub_it.hasNext()){
	       	System.out.print(sub_it.next()+" ");
	       }
	       System.out.println();
       }
        System.out.println(l.get(0));*/
      
       int q = sc.nextInt();
       for(int j=0;j<q;j++){
       	int x = sc.nextInt();
       	int y = sc.nextInt();
       	x--;
       	y--;
       	try{
       		System.out.println(l.get(x).get(y));
       	}catch(Exception e){
       		System.out.println("ERROR!");
       	}
       }
       
        
    }
}