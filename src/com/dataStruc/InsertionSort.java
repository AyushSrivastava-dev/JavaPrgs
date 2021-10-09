package com.dataStruc;
import java.util.*;
public class InsertionSort {
	public static void main(String args[]) {
		System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        List<Integer> l = new ArrayList<Integer>(n);
        System.out.println("Enter the elements");
        for(int k = 0; k<n; k++) {
        	int s = sc.nextInt();
        	a[k]= s;
        	l.add(s);
        	}
    
        /*Code for Insertion Sort*/
        int i,j,key;
         i=j=key = 0;
        for(i = 1; i<n; i++) {
        	key = a[i];
        	for(j = i-1; j>=0 && a[j]>key; j--) {
        		a[j+1] = a[j];
        	}
        	a[j+1] = key;
        }
        System.out.println("Sorted array : ");
        for(int k = 0; k<n ; k++) {
        	System.out.print(a[k]+" ");
        }
        /*Insertion Sort using List*/
        int p,q,temp;
        p=q=temp = 0;
        for( p = 1; p<n; p++) {
        	temp = l.get(p);
        	for(q = p-1; q>=0 && l.get(q)>temp; q--) {
        		l.set(q+1, l.get(q));
        	}
        	l.set(q+1, temp);
        }
        System.out.println("");
        for(int k = 0; k<n; k++) {
        	System.out.println(l.get(k));
        }
}

}
