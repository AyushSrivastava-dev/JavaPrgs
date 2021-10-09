package com.dataStruc;
import java.util.*;
public class HeapSort {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> l = new ArrayList<Integer>(n);
		System.out.println("Enter the elements");
		for(int i =0 ; i<n; i++) {
			int s = sc.nextInt();
			a[i] = s;
			l.add(s);
		}
		heapSortInArray(a,n-1);
		show(a);
		HeapSortInList(l,n-1);
		showList(l);
		
	}
	
	public static void buildHeap(int a[], int n) {
		for(int i = n/2-1; i>=0; i--) {
			heapify(a,n,i);
		}
	}
	public static void heapify(int[] a, int n, int i) {

		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<=n && a[l]>a[largest]) {
			
			largest = l; 
		}
		if(r<=n && a[r]>a[largest]) {
			largest = r;
		}
		if(largest !=i) {
			swap(a,largest,i);
			heapify(a,n,largest);
		}
	}
	public static void swap(int[] a, int largest, int i) {
		
		int t = a[i];
		a[i] = a[largest];
		a[largest] = t;
		
	}
	public static void heapSortInArray(int a[], int n) {
		buildHeap(a,n);
		for(int i =n; i>0 ;i--) {
			swap(a,0,i);
			heapify(a,i-1,0);
		}
	}
	public static void show(int a[]) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
	}
	/*Heap sort for List*/
	
	public static void heapifyList(List<Integer> a, int n, int i) {
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<=n && a.get(l)>a.get(largest)) {
			largest =l;
		}
		if(r<=n && a.get(r)>a.get(largest)) {
			largest = r;
		}
		if(largest!=i) {
			swapList(a,i, largest);
			heapifyList(a,n,largest);
		}
	}
	public static void swapList(List<Integer> a, int i, int largest) {
 
		int t = a.get(i);
		a.set(i, a.get(largest));
		a.set(largest, t);
	}
	public static void BuildHeapList(List<Integer> a, int n) {
		for(int i =n/2-1; i>=0;i--) {
			heapifyList(a,n,i);
		}
	}
	public static void HeapSortInList(List<Integer> a ,int n) {
		BuildHeapList(a,n);
		for(int i=n; i>0; i--) {
			swapList(a,0,i);
			heapifyList(a,i-1,0);
		}
	}
	private static void showList(List<Integer> l) {

		for(int i:l)
			System.out.println(i);
	}

}
