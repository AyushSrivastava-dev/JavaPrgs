package com.hello;

import java.util.Scanner;

public class DoubleLinkTester {
	public static void main(String args[]) {
		DoubleLink l = new DoubleLink();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice 1.InsertFront, 2.InsertRear, 3.DeleteRear, 4.DeleteFront, 5.show, 0.exit");
		int choice = sc.nextInt(); 
		do{
			 switch(choice)
			 { 

			   case 1:
			   System.out.println("enter value of list");
			   int val=sc.nextInt();
			   l.insertFront(val);
			   break;
			   case 2:
			    System.out.println("enter value of list");
			   val=sc.nextInt();
			   l.insert(val);
			   break;
			   case 3 :
				   l.deleteRear();;
				   break;
			   case 4:
				   l.deleteFront();
				  
				   break;
			   case 5 :
				   l.show();
				   break;
			   
			   default:
			   System.out.println("wrong input");
			  }
			System.out.println("Enter your choice 1.InsertFront, 2.InsertRear, 3.DeleteRear, 4.DeleteFront, 5.show, 0.exit");
			 choice = sc.nextInt();
			 }while(choice!=0);
	}

}
