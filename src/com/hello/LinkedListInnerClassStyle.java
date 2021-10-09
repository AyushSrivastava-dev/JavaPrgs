package com.hello;

import java.util.*;

public class LinkedListInnerClassStyle
 {
     
     
     
      class Node
{
   int data;
    LinkedListInnerClassStyle.Node next;
   public  Node()
   {
       data=0;
       next=null;
    }
    public Node( int d,LinkedListInnerClassStyle.Node n)
    {
        data=d;
        next=n;
   }
   public void setData(int d)
   {
       data=d;
   }
   public void setNext(LinkedListInnerClassStyle.Node n)
   {
       next=n;
   }
   public int getData()
   {
       return(data);
   }
   public Node getNext()
   {
       return(next);
   } 
}

 class linkedlist
{ LinkedListInnerClassStyle t2 = new LinkedListInnerClassStyle();
     int size;
   LinkedListInnerClassStyle.Node start;
    linkedlist()
   {
       size=0;
       start=null;
   }
   public void insertfirst(int val)
   {
       LinkedListInnerClassStyle.Node n=t2.new Node();
         n.setData(val);
         n.setNext(start);
         start=n;
         size++;
   }
   
   public void Insertlast(int val)
   {
       LinkedListInnerClassStyle.Node n,t;
       n=t2.new Node();
       n.setData(val);
       t=start;
       if(t==null)
       {
           start=n;
       }
       else{
           while(t.getNext()!=null)
           {
              
               t=t.getNext();
           }
            t.setNext(n);
       }
       size++;
   }
   
   public boolean isEmpty()
   {
   if(start==null)
   {
       return(true);
       
   }
   else
   
   return(false);
   }

   public int size()
   {
    return size;   
   }
   public void show(){
       LinkedListInnerClassStyle.Node n = start;
       while(n!=null){
           System.out.println(n.getData());
           n = n.getNext();
       }
   }
   
   
}
 public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   LinkedListInnerClassStyle t1 = new LinkedListInnerClassStyle();
LinkedListInnerClassStyle.linkedlist list=t1.new linkedlist();
int choice;
System.out.println("enter 1 for insertfirst and ,2 for insertlast");
choice=sc.nextInt();
do{
switch(choice)
{ 

  case 1:
  System.out.println("enter value of list");
  int val=sc.nextInt();
  list.insertfirst(val);
  break;
  case 2:
   System.out.println("enter value of list");
  val=sc.nextInt();
  list.Insertlast(val);
  break;
  default:
  System.out.println("wrong input");
 }
 System.out.println("enter 1 for insertfirst and ,2 for insertlast");
     choice = sc.nextInt();
}while(choice!=0);
list.show();
}
}
