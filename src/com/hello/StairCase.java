package com.hello;
import java.util.*;
class StairCase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    if(n>0 && n<=100){
        for(int i =1; i<=n;i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k =1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println("");
            
        }
    }

    }
    public static void main(String args[]) {
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the size");
    	int n = sc.nextInt();
    	staircase(n);
    }

}
