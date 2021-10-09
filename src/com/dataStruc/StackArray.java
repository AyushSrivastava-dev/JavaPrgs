package com.dataStruc;
import java.util.*;
public class StackArray {
	int top = 0;
	int stack[] = new int[5];
	public void push(int data) {
		stack[top++]= data;
	}
	public void show() {
		for(int n:stack) {
			System.out.print(n+" ");
		}
	}
	public void pop() {
		int data;
		 data = stack[--top];
		 System.out.println("Popped element is : "+data);
	}
	public static void main(String args[]) {
		StackArray sa = new StackArray();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice 1.push, 2.pop, 3.show");
		int ch = sc.nextInt();
		do {
			switch(ch) {
			case 1 : 
				System.out.println("Enter the element");
				int n = sc.nextInt();
				sa.push(n);
				break;
			case 2:
				sa.pop();
				break;
			case 3 :
				sa.show();
			}
			System.out.println("Enter your choice 1.push, 2.pop, 3.show");
            ch = sc.nextInt();
			
		}while(ch!=0);
	}

}
