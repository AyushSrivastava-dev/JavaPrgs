package com.hello;
import java.util.*;
public class CircularLink {
	Node rear;
	int size;
	
	public void insertAtRear(int a) {
		Node n = new Node();
		n.data = a;
		if(rear == null) {
			rear = n;
			n.next = n;
			
		}
		else {
			n.next = rear.next;
			rear.next = n;
			rear = n;
			
		}
		size++;
	}
	public void insertAtFront(int a) {
		Node n = new Node();
		n.data = a;
		if(rear == null) {
			rear = n;
			n.next = n;
		}
		else {
			n.next = rear.next;
			rear.next = n;
		}
	}
	public void deleteFront() {
		if(rear == null) {
			System.out.println("List is empty");
			
		}
		else {
			System.out.println("Deleted element is : "+rear.next.data);
			rear.next = rear.next.next;
			
			
		}
	}
	public void deleteRear() {
		if(rear == null) {
			System.out.println("List is empty");
			
		}
		else {
			Node p = rear.next;
			while(p.next!=rear) {
				p = p.next;
				
			}
			p.next = rear.next;
			System.out.println("Deleted element is : "+rear.data);
			rear = p;
		}
	}
	public void show() {
		if(rear!=null) {
			Node n = rear.next;
			while(n.next!=rear.next) {
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
		else if(rear.next == rear) {
			System.out.println(rear.data);
		}
		else if(rear == null){
			System.out.println("List is empty");
		}
		
		
	}

}
