package com.hello;

public class LinkList {
	int data;
	Node head;
	public LinkList() {
		data =0;
		head =null;
	}
	public void insert(int d) {
		Node n = new Node();
		n.data = d;
	    n.next = null;
		if(head!=null) {
			Node p = new Node();
			p = head;
			while(p.next!=null) {
				p = p.next;
			}
			p.next = n;
		}
		else {
			head = n;
		}
	}
	public void show() {
		int r = 0;
		Node n ;
		n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
			r++;
		}

	}
	public void insertStart(int a) {
		Node n =new Node();
		n.data =a;
		if(head==null) {
			head = n;
			n.next = null;
		}
		else {
			n.next = head;
			head = n;
		}
		
		
	}
	public void delete() {
		int r = 0;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node n = head;
			while(n.next.next != null) {
				n = n.next;
			}
			Node p = n.next;
			n.next = null;
			r = p.data;
			System.out.println("The deleted element is "+r);
		}
		
	}
	public void deleteFront() {
		int r = 0;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node n = head;
			head = n.next;
			r = n.data;
			System.out.println("The deleted element is "+r);
		}
	}
	public int len() {
		int r = 0;
		Node n ;
		n = head;
		if(head != null) {
			while(n!=null) {
				r++;
				n = n.next;
			}
		}
		else {
			return -999;
		}
		return r;
	}
	public void insertAtPos(int a, int b) {
		int r = 1;
		System.out.println("the length is : "+len());
		Node p = new Node();
		p.data = a;
		if(b<=len()) {
			if(b == 1) {
				p.next = head;
				head = p;
			}
			else {
			System.out.println("the length is : "+len());
			Node n = head;
			while(r<(b-1)) {
			    n = n.next;
			    r++;
			}
			
			p.next = n.next;
			n.next = p;
		}
		}
		else {
			System.out.println("Index out of bound"+len());
		}
	}
	public void reverseLink() {
		Node prev = null;
		Node nex = null;
		Node current = head;
		while(current!=null) {
			nex = current.next;
			current.next = prev;
			prev = current;
			current = nex;
		}
		head = prev;
	
		}
	}
	


