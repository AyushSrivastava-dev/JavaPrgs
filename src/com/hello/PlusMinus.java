package com.hello;

import java.util.ArrayList;
import java.util.List;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float p,n,z;
    int size = arr.size();
    if(arr.size()>0 && arr.size()<=100){
        p = 0;
        n=0;
        z=0;
        for(int i =0; i<arr.size(); i++){
            if(arr.get(i)>=-100 && arr.get(i)<=100){
                if(arr.get(i)>0){
                    p++;
                    System.out.printf("nahi"+p);
                }
                else if(arr.get(i)<0){
                    n++;
                }
                else if(arr.get(i)==0){
                    z++;
                }
            }
        }
        float po = (p/size);
        float ne = n/size;
        float ze = z/size;
        System.out.printf("%.6f\n",po);
        System.out.println(ne);
        System.out.println(ze);
        
        
    }

    }
    public static void main(String args[]) {
    	List<Integer> a = new ArrayList<Integer>();
    	a.add(1);
    	a.add(1);
    	a.add(0);
    	a.add(-1);
    	plusMinus(a);
    	
    }

}
