package com.dataStruc;
import java.util.*;
public class SelectionSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> l = new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for(int i = 0; i<n; i++) {
			int s = sc.nextInt();
			a[i] = s;
			l.add(s);
		}
		
		/*Applying Selection Sort in ascending order*/
		for(int i =0; i<n-1; i++) {
			int p = i;
			for(int j = i+1; j<n;j++ ) {
				if(a[p]>a[j]) {
					p=j;
				}
			}
			int t = a[p];
			a[p] = a[i];
			a[i] = t;
		}
		System.out.println("Sorted array is ");
		for(int i =0; i<n; i++) {
			System.out.print(a[i]+"  ");
		}
		/*Selection sort in list */
	    for(int i=0; i<n-1; i++) {
	    	int p = i;
	    	for(int j=i+1; j<n; j++) {
	    		if(l.get(p)>l.get(j)) {
	    			p = j;
	    		}
	    		int t = l.get(p);
	    		l.set(p, l.get(i));
	    		l.set(i, t);
	    	}
	    	
	    }	    	
	    System.out.println("Sorted list");

	    for(int i=0; i<n; i++) {
	    	System.out.println(l.get(i));
	    }
	}

}
