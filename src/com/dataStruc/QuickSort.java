package com.dataStruc;
import java.util.*;
public class QuickSort {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		List<Integer> l = new ArrayList<Integer>(n);
		System.out.println("Enter the elements");
		for(int i =0; i<n ; i++) {
			int s = sc.nextInt();
			a[i] = s;
			l.add(s);
			
		}
		/*Quick Sort algorithm starts from here*/
		QuickS(a,0,n-1);
		show(a);
		QuickSortUsingList(l,0,n-1);
		showLst(l);
	}
	public static int partition(int a[],int l, int u) {
		
		int v= a[u];
		int i = l-1;
		for(int j=l; j<=u-1;j++) {
			if(a[j]<v) {
				i++;
				int t = a[j];
				a[j] = a[i];
				a[i] = t;
			}
		}
		a[u]=a[i+1];
		a[i+1] = v;
		return (i+1);
	}
	public static void QuickS(int a[], int l, int u) {
		if(l<u) {
			int j = partition(a,l,u);
			QuickS(a,l,j-1);
			QuickS(a,j+1,u);
		}
	}
	public static void show(int a[]) {
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	/*Quick Sort in list*/
	
	public static int partitionList(List<Integer> a, int l , int u) {
		int v = a.get(u);
		int i = l-1;
		for(int j =l; j<=u-1; j++) {
			if(a.get(j)<v) {
				i++;
				int t = a.get(i);
				a.set(i, a.get(j));
				a.set(j, t);
			}
		}
		a.set(u, a.get(i+1));
		a.set(i+1, v);
		return (i+1);
	}
	public static void QuickSortUsingList(List<Integer> a,int l, int u) {
		if(l<u) {
			int j = partitionList(a,l,u);
			QuickSortUsingList(a,l,j-1);
			QuickSortUsingList(a,j+1,u);
		}
	}
		public static void showLst(List<Integer> a){
			for(int i : a) {
				System.out.println(i);
			}
		}
	

}
