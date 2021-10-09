package com.hello;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DiagonalDiff {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int left = 0;
    int right = 0;
    int n = arr.size()-1;
    for(int i =0; i<arr.size(); i++){
        List<Integer> row = arr.get(i);
        for(int j=0; j<row.size(); j++){
            if(row.get(j)>=-100 && row.get(j)<=100){
                if(i==j){
                    left = left+row.get(j);
                }
                if((i+j) == n){
                    right = right+row.get(j);
                }
            }
        }
    }
    int result = left-right;
    result = Math.abs(result);
    return result;

    }
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size");
    	int n = sc.nextInt();
    	System.out.println("Enter data");
    	List<List<Integer>> arrr = new ArrayList<List<Integer>>();
    	for(int i =0; i<n; i++)
    	{  List<Integer> l = new ArrayList<Integer>();
    		for(int j = 0; j<n; j++) {
    			int s = sc.nextInt();
    			l.add(s);
    		}
    		arrr.add(l);
    	}
    	System.out.println(diagonalDifference(arrr));

}
}
