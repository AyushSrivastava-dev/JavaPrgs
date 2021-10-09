package com.hello;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int f = 0;
        if((a.length()>=1 && a.length()<=50) && (b.length()>=1 && b.length()<=50)){
             a = a.toLowerCase();
             b = b.toLowerCase();
            for(char c='a'; c<'z'; c++){
               int f1 = 0;
               int f2 = 0;
               for(int i = 0; i<a.length(); i++){
                   if(a.charAt(i)==c){
                       f1++;
                   }
               }
               for(int i =0; i<b.length(); i++){
                   if(b.charAt(i)==c){
                       f2++;
                   }
               }
               if(f1!=f2){
                   
                   f = 1;
                   break;
               }
            }
            if(f!=1){
                return true;
            }
              
        }
        return false;  
    }

    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

