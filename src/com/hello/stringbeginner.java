package com.hello;

import java.io.*;
import java.util.*;

public class stringbeginner {

    public static void main(String[] args) {
        //This commented code is for sum of length of two words and comparing lexicographically
     /*   Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int s = A.length() + B.length();
        System.out.println(s);
        int re = A.compareToIgnoreCase(B);
        if(re<0) {
        	System.out.println("No");
        }
        else {
        	System.out.println("Yes");
        }
        String str = Character.toUpperCase(A.charAt(0))+A.substring(1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1);
        System.out.println(str);*/
    	
    	
    	
    	
    	
        /* Enter your code here. Print output to STDOUT. */
        String s1 = "java";
        String s2 = "hello";
        String s3 = "Shyam";
        String s4 = "ABC";
  
        System.out.println(" Comparing strings with compareTo:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(getSmallestAndLargest("welcometojava",3));
    }
  
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            
            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length '
            int ab = k;
            smallest = s.substring(0,k);
            largest = s.substring(0,k);
            for(int i =1; i<=s.length()-ab; i++){
                String str = s.substring(i,++k);
                if(smallest.compareToIgnoreCase(str)>0){
                    smallest = str;
                }
                if(largest.compareToIgnoreCase(str)<0){
                    largest = str;
                }
            }
            
            return smallest + "\n" + largest;
        }

}

