package com.hello;
import java.util.*;
public class LinkTester {
	public static void main(String args[]) {
		 LinkList l = new LinkList();
		 Scanner sc = new Scanner(System.in);
		 int choice;
		 System.out.println("enter 1 for insert and ,2 for insert at start, 3 delete,4 show,5 delete at start,6 to insert at your position, 7 to reverse, 0 to exit");
		 choice=sc.nextInt();
		 do{
		 switch(choice)
		 { 

		   case 1:
		   System.out.println("enter value of list");
		   int val=sc.nextInt();
		   l.insert(val);
		   break;
		   case 2:
		    System.out.println("enter value of list");
		   val=sc.nextInt();
		   l.insertStart(val);
		   break;
		   case 3 :
			   l.delete();
			   break;
		   case 4:
			   l.show();
			   break;
		   case 5 :
			   l.deleteFront();
			   break;
		   case 6:
			   System.out.println("enter value of list and position");
			   val=sc.nextInt();
			   int pos = sc.nextInt();
			   l.insertAtPos(val, pos);
			   break;
		   case 7:
			   l.reverseLink();
			   break;
			    
		   default:
		   System.out.println("wrong input");
		  }
		 System.out.println("enter 1 for insert and ,2 for insert at start, 3 delete,4 show,5 delete at start,7 to reverse,0 to exit");
		      choice = sc.nextInt();
		 }while(choice!=0);
	}

 
}
