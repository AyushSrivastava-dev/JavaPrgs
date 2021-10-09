package com.dataStruc;
import java.util.*;
public class Dequeue {
	int dq[] = new int[5];
	int front,rear;
	int max = 4;
	public Dequeue() {
		front = -1;
		rear =-1;
	}
	public void insertR(int a) {
		if(isFull()) {
			System.out.println("Queue is full");
			
		}
		else if(front ==-1) {
			front = rear =0;
			dq[rear] = a;
		}
		else {
			rear = (rear+1)%max;
			dq[rear] = a;
		}
	}
	public boolean isFull() {
		if((rear+1)%max == front) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(front == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void insertF(int a) {
		if(isFull()) {
			System.out.println("Queue is full");
			
		}
		else if(front ==-1) {
			front = rear =0;
			dq[rear] = a;
		}
		else {
			front = (front-1+ max)%max;
			dq[front] = a;
		}
		
	}
	public void deleteR() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else if(rear == front && rear!=-1) {
			System.out.println("Deleted element is "+dq[rear]);
			front = rear = -1;
		}
		else {
			System.out.println("Deleted element is "+dq[rear]);
			rear = (rear-1+ max)%max;
			
		}
	}
	public void deleteF() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else if(rear == front && rear!=-1) {
			System.out.println("Deleted element is "+dq[front]);
			front = rear = -1;
		}
		else {
			System.out.println("Deleted element is "+dq[front]);
			front = (front+1)%max;
		}
	}
	public void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			int i =0;
			for(i = front; i!=rear; i=(i+1)%max) {
				System.out.println(dq[i]);
			}
			System.out.println(dq[i]);
		}
	}
	public static void main(String args[]) {
		Dequeue c = new Dequeue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice 1.insertFront,2.InsertRear 3.deleteFront, 4.DeleteRear,5. show");
		int ch = sc.nextInt();
		do {
			switch(ch) {
			case 1 : 
				System.out.println("Enter the element");
				int n = sc.nextInt();
				c.insertF(n);
				break;
			case 2:
				System.out.println("Enter the element");
				int x = sc.nextInt();
				c.insertR(x);
				break;
			case 3:
				c.deleteF();
				break;
			case 4:
				c.deleteR();
				break;
			case 5 :
				c.show();
			}
			System.out.println("Enter your choice 1.insert, 2.delete, 3.show");
            ch = sc.nextInt();
			
		}while(ch!=0);
	}
}
