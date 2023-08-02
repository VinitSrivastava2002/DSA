package com.vinit.recursion.string;

public class Stream {
    public static void main(String[] args) {
        // Remove a from a given string and store in a new string
        skip("", "baccda");

    }
    //P is denoted as processed string and UP is Unproccesed or define String
    // Substring is return a new string that is substring of a string
    static void skip(String P, String UP){

        if(UP.isEmpty()){
            System.out.println(P);
            return;
        }
        char ch=UP.charAt(0);

        if(ch=='a'){
            skip(P,UP.substring(1));
        }
        else{
            skip(P+ch, UP.substring(1));
        }
    }


}
