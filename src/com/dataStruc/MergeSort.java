package com.dataStruc;
import java.util.*;
public class MergeSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> l = new ArrayList<Integer>(n);
		System.out.println("Enter the elements");
		for(int i =0; i<n; i++) {
			int s = sc.nextInt();
			a[i] = s;
			l.add(s);
			
		}
		MergeSortArray(a,0,n-1);
		show(a);
		System.out.println(" ");
		mergeSList(l,0,n-1);
		showList(l);
		
		
	}
	public static void Merge(int a[], int m, int l, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i =0; i<n1; i++)
			L[i] = a[l+i];
		for(int i=0; i<n2; i++)
			R[i] = a[m+1+i];
	    
		int i = 0,j=0;
		int k = l;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				a[k] = L[i];
				k++;
				i++;
			}
			else {
				a[k] = R[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			a[k] = L[i];
			k++;
			i++;
		}
		while(j<n2) {
			a[k] = R[j];
			k++;
			j++;
		}
		
	}
	public static void MergeSortArray(int a[], int l , int r) {
		if(l<r) {
			 int m = (r+l)/2;
			 MergeSortArray(a,l,m);
			 MergeSortArray(a,m+1,r);
			 Merge(a,m,l,r);
		}
		 
	}
	public static void show(int a[]) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
	}
	
	/*Merge Sort using list*/
	public static void mergeSList(List<Integer> a, int l , int r) {
		if(l<r) {
			int m = (l+r)/2;
			mergeSList(a,l,m);
			mergeSList(a,m+1,r);
			MergeList(a,m,l,r);
		}
	}
	public static void MergeList(List<Integer> a, int m, int l, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		List<Integer> L = new ArrayList<Integer>(n1);
		List<Integer> R = new ArrayList<Integer>(n2);
		for(int i =0; i<n1; i++)
			L.add(a.get(l+i));
		for(int i = 0; i<n2; i++)
			R.add(a.get(m+1+i));
		int i=0,j=0;
		int k = l;
		while(i<n1 && j<n2) {
			if(L.get(i)<R.get(j)) {
				a.set(k, L.get(i));
				i++;
				k++;
			}
			else {
				a.set(k, R.get(j));
				j++;
				k++;
			}
		}
		while(i<n1) {
			a.set(k, L.get(i));
			i++;
			k++;
		}
		while(j<n2) {
			a.set(k, R.get(j));
			j++;
			k++;
			
		}
		
		
		
	}
	public static void showList(List<Integer> a) {
		for(int i: a) {
			System.out.println(i);
		}
	}

}
