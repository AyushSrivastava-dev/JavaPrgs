package com.hello;

public class DoubleLink {
	Node head;
	public void insert(int a) {
		Node n = new Node();
		n.data = a;
		if(head == null) {
			head = n;
			n.next = null;
			n.prev = null;
		}
		else {
			Node p = head;
			while(p.next!=null) {
				p = p.next;
			}
			p.next = n;
			n.prev = p;
			n.next = null;
		}
	}
	public void insertFront(int a) {
		Node n = new Node();
		n.data = a;
		if(head == null) {
			head = n;
			n.next = null;
			n.prev = null;
		}
		else {
			n.next = head;
			head.prev = n;
			head = n;
			n.prev = null;
		}
	}
	public void deleteFront() {
		if(head == null) {
			System.out.println("List is empty ");
			
		}
		else {
			System.out.println("Deleted element is  : "+head.data);
			head = head.next;
			head.prev = null;
		}
	}
	public void deleteRear() {
		if(head == null) {
			System.out.println("List is empty ");
			
		}
		else {
			Node n = head;
			while(n.next.next!=null) {
				n = n.next;
			}
			System.out.println("Deleted element is  : "+ n.next.data);
			n.next = null;
			
		}
	}
	public void show() {
		Node n = head;
		if(head == null) {
			System.out.println("List is empty");
			
		}
		else {
			while(n!=null) {
				System.out.println(n.data);
				n = n.next;
				
			}
		}
	}

}
