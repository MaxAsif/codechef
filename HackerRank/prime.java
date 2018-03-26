import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class prime {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  BigInteger n = in.nextBigInteger();
  in.close();
  int ctr = 0;
      // Write your code here.
  for(BigInteger i = BigInteger.valueOf(1);i.compareTo(n)<=0;i = i.add(BigInteger.ONE))
  {
    if(n.mod(i).equals(BigInteger.ZERO)){
      System.out.println(i);
      ctr++;
    }
  }
  if(ctr==2)
   System.out.println("prime");
 else
   System.out.println("not prime");
}
}
