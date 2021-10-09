package com.dataStruc;
import java.util.*;
public class CircularQueue {
	int cq[] = new int[5];
	int front,rear;
	public CircularQueue() {
	 front = -1;
	 rear = -1;
	}
	int max = 4;
	public void insert(int a) {
		if(isFull()) {
			System.out.println("Queue is full");
			
		}
		else if(isEmpty()) {
			front = 0;
			rear = 0;
			cq[rear] = a;
		}
		else {
			if(!isFull()) {
			rear = (rear+1)%max;
			cq[rear] = a;
			}
		}
	}
	public boolean isFull() {
		if(((rear+1)%max) == front) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(front == -1 && rear ==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void delete() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else if(front == rear && front!=-1) {
			System.out.println("Deleted element is : "+cq[front]);
			front =-1;
			rear =-1;
		}
		else {
			System.out.println("Deleted element is : "+cq[front]);
            front++;
		}
	}
	public void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i =front; i!=rear; i=(i+1)%max) {
				System.out.println(cq[i]);
			}	
		}
		
	}
	public static void main(String args[]) {
		CircularQueue c = new CircularQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice 1.insert, 2.delete, 3.show");
		int ch = sc.nextInt();
		do {
			switch(ch) {
			case 1 : 
				System.out.println("Enter the element");
				int n = sc.nextInt();
				c.insert(n);
				break;
			case 2:
				c.delete();
				break;
			case 3 :
				c.show();
			}
			System.out.println("Enter your choice 1.insert, 2.delete, 3.show");
            ch = sc.nextInt();
			
		}while(ch!=0);
	}

}
