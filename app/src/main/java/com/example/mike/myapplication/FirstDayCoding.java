package com.example.mike.myapplication;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDayCoding {

    public static void main(String[] args) {
        FirstDayCoding fdc = new FirstDayCoding();

        ArrayList<String> sl = new ArrayList <String>();
        sl.add("a");
        sl.add("b");
        sl.add("c");
        sl.add("b");
        fdc.findDuplicates(sl);

        String s = "palindromeOrNot";
        fdc.checkPalindrome(s);

        fdc.fizzBuzz(20);

        fdc.printTables();

        fdc.findDuplicates("qweqwe", "ewqewq");

    }

    public void findDuplicates(List<String> a){
        int i;
        String s;
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();

        for (i=0; i<a.size(); i++){
            s = a.get(i).toLowerCase();

            if ( occurences.containsKey(s) ){
                if ( occurences.get(s) == 1 ){
                    System.out.println(s);
                }else{
                    occurences.put(s, occurences.get(s) + 1);
                }
            }else{
                occurences.put( s, 1 );
            }
        }
    }

    public void checkPalindrome(String word){
        int i,k;
        String w = word.toLowerCase();

        for ( i=0; i<w.length()/2; i++ ){
            k = w.length()-i-1;
            if ( w.charAt(i) != w.charAt(k) ){
                System.out.println("Not a palindrome...");
                return;
            }
        }
        System.out.println("It is a palindrome!");
    }

    public void fizzBuzz(int count){
        int i;
        String s;

        for ( i=0; i<count; i++ ){
            System.out.print(String.valueOf(i)+" ");
            s = "";

            if ( i%3==0 ){
                s += "fizz";
            }
            if( i%5 == 0 ){
                s += "buzz";
            }
            if ( s.equals("") ){
                s += String.valueOf(i);
            }
            System.out.println(s);
        }
    }

    public void findDuplicates(String word1, String word2){
        if ( sortString(word1.toLowerCase()).equals(sortString(word2.toLowerCase())) ){
            System.out.println( word1+"/"+word2+" - It is an anagram!" );
        }else{
            System.out.println( word1+"/"+word2+" - It is not an anagram..." );
        }
    }

    @NonNull
    static String sortString(String s ){
        char[] ar = s.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }

    public void printTables(){
        int i,k;
        for ( i=1; i<11; i++ ){
            for ( k=1; k<11; k++ ){
                System.out.print(String.valueOf(i*k)+" ");
            }
            System.out.print("\n");
        }
    }

}
