package com.hello;

import java.io.*;
import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int limit = 4*100000;
    
        if(s.length()>=1 && s.length()<=limit){
            String arr[] = s.split("!|\\,|\\?|\\.|\\_|\\'|\\@");
            StringBuilder build = new StringBuilder();
            for(int i =0; i<arr.length; i++){
                build.append(arr[i]+" ");
                
            }
            
            StringTokenizer st = new StringTokenizer(build.toString());
            System.out.println(st.countTokens());
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
        }
        
        // Write your code here.
        scan.close();
    }
}

