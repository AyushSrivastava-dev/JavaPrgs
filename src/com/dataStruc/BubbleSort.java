package com.dataStruc;
import java.util.*;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> l = new ArrayList<Integer>(n);
		System.out.println("Enter the elements in array");
		for(int i =0; i<n; i++) {
			int s = sc.nextInt();
			a[i] = s;
			l.add(s);
			
		}
		/*Applying Bubble Sorting from here For ascending order*/
		for(int i =0; i<n-1; i++) {
			for(int j = 0; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					
				}
				
			}
		}
		System.out.println("Ascending order sorted array : ");
		for(int i=0; i<n; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println("");
		
		/*Bubble Sort in list*/
		
		for(int i =0; i<n-1; i++) {
			for(int j = 0; j<n-1-i; j++) {
				if(l.get(j)>l.get(j+1)) {
					int t = l.get(j);
					l.set(j, l.get(j+1));
					l.set(j+1, t);
					
				}
				
			}
		}
		for(int i : l) {
			System.out.println(i);
		}
       
	}

}
