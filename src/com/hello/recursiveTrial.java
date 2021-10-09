package com.hello;
import java.util.*;
public class recursiveTrial {

	int binarysearch(int arr[], int n, int k){
        // code here
        int r=0;
       
        if(n>=1){
            r = recursiveBs(arr,0,n-1,k);
        }
        return r;
    }
     int recursiveBs(int a[], int l, int u, int k){
        int m = (u+l)/2;
        if(l<=u){
        if((a[m] == k)&&(a[m]>=1 && a[m]<=10000)){
            return m;
        }
        else if((a[m]<k)&&(a[m]>=1 && a[m]<=10000)){
            return recursiveBs(a,m+1,u,k);
        }
        else if((a[m]>k)&&(a[m]>=1 && a[m]<=10000)){
            return recursiveBs(a,l,m-1,k);
        }
    }
    else{
    
    return -1;
    }
    return -1;
    }
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int n = sc.nextInt();
    	 
    	 
    	 int a[] = new int[n];
    	 for(int i =0; i<n; i++) {
    		 a[i] = sc.nextInt();
    	 }
    	 int k = sc.nextInt();
    	 recursiveTrial rr = new recursiveTrial();
    	 System.out.println(rr.binarysearch(a, n, k));
     }
}
