package com.hello;
import java.util.*;
import java.io.*;
public class BinaryS {
	public static void main(String args[])throws IOException {
		System.out.println("Enter the size of array");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		System.out.println("Enter the elements in random order");
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		} 
		System.out.println("Sorting it using bubble sorting technique");
		for(int i =0; i<size-1; i++) {
			for(int j = 0;j<size-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					
				}
				
			}
		}
		System.out.println("Sorted in ascending order");
		
		
		System.out.println("Now applying Binary sort iteratively So \n Enter the number to be searched");
		int n = Integer.parseInt(br.readLine());
		int l = 0;
		int u = size-1;
		int m = 0;
		int c = 0;
		while(l<u) {
			m = (l+u)/2;
			if(arr[m]== n) {
				System.out.println("Found at index: "+m);
				c = 1;
				break;
			}
			else if(arr[m]>n) 
				u = m-1;
			else if(arr[m]<n)
				l = m+1;
			
		}
		if(c==0)
			System.out.println("Not found");
		System.out.println("Now applying Binary search recursively\nThe element is found at index: "+RecursiveBinaryS(0,size-1,n,arr));
		
	br.close();
	}
	static int RecursiveBinaryS(int l, int u, int key, int arr[]) {
		if(l<=u && l<arr.length-1) {
			int m =(l+u)/2;
			if(arr[m]==key) {
				return m;
			}
			else if(key<arr[m]) {
				return RecursiveBinaryS(l,m-1,key,arr);
			}
			else if(key>arr[m]) {
				return RecursiveBinaryS(m+1,u,key,arr);
			}
		
		}
		
			return -1;
	}
	
}
