package com.hello;
import java.util.*;
public class arr2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the values");
		for(int i=0; i<n; i++) {
			a[i]=s.nextInt();
		}
		for(int i =0; i<n-1;i++) {
			int p =i;
			for(int j =i;j<n;i++) {
				if(a[p]>a[j]) {
					p=j;
				}
			}
			int t = a[p];
			a[p]=a[i];
			a[i]=t;
		}
		for(int i=0; i<n; i++) {
			System.out.print(a[i]);
		}
	}
   
}
