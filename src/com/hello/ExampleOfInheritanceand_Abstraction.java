package com.hello;

public class ExampleOfInheritanceand_Abstraction {
	/*Definitions: A class that is derived from another class is called a subclass (also a derived class, extended class, or child class). The class from which the subclass is derived is called a superclass (also a base class or a parent class).

Excepting Object, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object.*/
	/*Object obj = new MountainBike();
then obj is both an Object and a MountainBike (until such time as obj is assigned another object that is not a MountainBike). This is called implicit casting.*/

}
//abstract class
abstract class Sum{
 /* These two are abstract methods, the child class
  * must implement these methods
  */
 public abstract int sumOfTwo(int n1, int n2);
 public abstract int sumOfThree(int n1, int n2, int n3);
	
 //Regular method 
 public void disp(){
	System.out.println("Method of class Sum");
 }
}
//Regular class extends abstract class
class Demo extends Sum{

 /* If I don't provide the implementation of these two methods, the
  * program will throw compilation error.
  */
 public int sumOfTwo(int num1, int num2){
	return num1+num2;
 }
 public int sumOfThree(int num1, int num2, int num3){
	return num1+num2+num3;
 }
 public static void main(String args[]){
	Sum obj = new Demo();
	System.out.println(obj.sumOfTwo(3, 7));
	System.out.println(obj.sumOfThree(4, 3, 19));
	obj.disp();
 }
}
