import java.io.*;
import java.util.*;

class Solution {
	  static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        String[] A = a.split("");
        String[] B = b.split("");
        List<String> l1 =Arrays.asList(A);
        List<String> l2 =Arrays.asList(B);
        
        Collections.sort(l1);
        Collections.sort(l2);
       
        if(l1.equals(l2))
        	return true;
        else
        	return false;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}