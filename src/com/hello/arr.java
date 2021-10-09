package com.hello;
import java.util.*;
public class arr {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("enter amount");
    	 int a[] = {1000,500,200,100,50,20,10,5,2,1};
    	 int amt = sc.nextInt();
    	 int x = amt;
    	 for(int i=0; i<a.length; i++) {
    		 int n = amt/a[i];
    		 if(n!=0) 
    			 System.out.println(a[i]+"x"+n+"="+a[i]*n);
    			 amt = amt%a[i];
    	 }
    		 System.out.println("Total="+x);
    	 
     }
}
