package com.dataStruc;
import java.util.*;
import java.io.*;
public class StackLink {


Node top = new Node();
int size;
public void push(int a) {
	StackLink sl = new StackLink();
	Node temp = new Node();
	temp.data = a;
	if(top == null) {
		top = temp;
		temp.next = null;
	}
	else {
		temp.next = top;
		top = temp;
	}
	size++;
}
public void pop() {
	if(top!=null) {
		System.out.println("Popped element is: "+top.data);
		top = top.next;
		size--;
	}else {
		System.out.println("Stack is empty");
	}
}
public void show() {
	Node temp = top;
    if(top!=null) {
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    }
    else {
    	System.out.println("Stack is empty");
    }
}
public static void main(String args[]) {
	StackLink sa = new StackLink();
    Scanner sc = new Scanner(System.in);
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
			break;
		}
		System.out.println("Enter your choice 1.push, 2.pop, 3.show");
        ch = sc.nextInt();
		
	}while(ch!=0);
}
}
