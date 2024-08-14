import java.io.*;
import java.util.*;


public class recursion {
    // factorial
    public static int calcfactorial (int n) {
        if(n==1 || n==0){
            return 1;
        }
        int fac_m1 = calcfactorial(n-1);
int fac_n = n * fac_m1;  
return fac_n; 
 }
// fibonnaci series
public static void calcfibonacci (int a,int b, int n) {{
if(n==0){
    return;
}
int c = a+b;
System.out.println(c);
calcfibonacci(b,c,n-1);
}
}

public static void main(String args[]){
    int n = 5;
    int a=0,b=1;
    System.out.println(a);
    System.out.println(b);
    int ans = calcfactorial(n);
    System.out.println(ans);
   
    calcfibonacci(a,b,n-2);
}
}
