//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures


import java.io.*;
import java.util.*;

class UniqueChar {
    
    public static Boolean isUnique(String str){
      if(str.length() > 256) return false;
      
      boolean[] char_set = new boolean[256];
      
      for(int i = 0; i < str.length(); i++){
        int val = str.charAt(i);
        
        if (char_set[val]){
          return false;
        }
        char_set[val] = true;
      }
      
      return true;
    }
     
    public static void main(String[] args) {
      String s = "evryday";
      System.out.print(isUnique(s));
    }  
}
