package com.hello;
import java.util.*;
import java.io.*;
public class arr3 {
	public static void main(String args[])throws IOException {
		int n;
		System.out.print("enter the number");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n= Integer.parseInt(br.readLine());
		int a[] =new int[n];
		System.out.print("the number is "+a.length);
		for(int i =0; i<n;i++) {
			System.out.println("enter the value");
			a[i]=Integer.parseInt(br.readLine());
		}
		
		for(int j=0;j<n-1;j++) {
			int p =j;
			for(int k=j; k<n;k++) {
				if(a[p]>a[k])
					p=k;
			}
			int t = a[j];
			a[j]= a[p];
			a[p]=t;
		}
		for(int i =0; i<n;i++) {
			System.out.println("value  "+a[i]);
		}
	}

}
