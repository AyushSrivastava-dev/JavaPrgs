package com.hello;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int r = 0;
    if((a.size()>=1 && a.size()<=10) && (b.size()>=1 && b.size()<=10)){
        int min = b.get(0);
        int gcd1 = 0;
        int gcd2 = 0;
        if(b.size()==1){
            gcd1 = min;
        }
        else{
           for(int i =1; i<b.size(); i++){
            if(b.get(i)>=1 && b.get(i)<=100){
                int max = min>b.get(i)?min:b.get(i);
                int mii = min<b.get(i)?min:b.get(i);
                gcd1 = gcdf(mii,max);
            }
            min = gcd1;
        } 
        }
        
        int s = a.get(0);
        int lcm = 0;
        if(a.size()==1){
            lcm = s;
        }
        else{
            for(int i =1; i<a.size(); i++){
            if(a.get(i)>=1 && a.get(i)<=100){
                int max = s>a.get(i)?s:a.get(i);
                int mii = (s<=a.get(i))?s:(a.get(i));
                gcd2 = gcdf(mii,max);
                lcm = (a.get(i)*s)/gcd2;
            }
            s = lcm;
        } 
        }
        if(gcd1%lcm == 0){
            for(int i =lcm; i<=gcd1; i++){
                if(gcd1%i == 0){
                    if(div(i,a)){
                        r++;
                    }
                    else{
                        continue;
                    }
                
                }
            }
        }
        else{
            r=0;
        }
        
        
         
    }
    return r;

    }
    public static int gcdf(int m, int n){
        
        if(m ==0){
            return n;
        }
        return (gcdf(n%m,m));
    }
    public static boolean div(int a, List<Integer> b){
        boolean flag = false;
        for(int i=0; i<b.size(); i++){
            if(a%b.get(i) == 0){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String args[]) {
    	List<Integer> a = new ArrayList<Integer>();
    	List<Integer> b = new ArrayList<Integer>();
    	a.add(3);
    	a.add(9);
    	a.add(6);
    	b.add(36);
    	b.add(72);
    	System.out.println(getTotalX(a,b));
    	System.out.println(otherMethod(a,b));
    	
    	
    }
    public static int otherMethod(List<Integer> a, List<Integer> b) {
    	int r = 0;
    
    	List<Integer> c = new ArrayList<Integer>();
    	int j = Collections.min(b);
    	for(int k = 1; k<=j; k++){
    			boolean f = false;
    			for(int i = 0; i< b.size(); i++) {
    				int x = b.get(i);
    				if(x%k == 0) {
        				
        				f = true;
        			}
    				else {
    					f = false;
    					break;
    				}
    			}
    			if(f) {
    				c.add(k);
    				
    			
    			}
    			
    			
    		
    		}
    		for(int i =0 ; i<c.size(); i++) {
    			if(div(c.get(i),a)) {
    				r++;
    				
    			}
    		}
    		return r;
    	
    }

}
