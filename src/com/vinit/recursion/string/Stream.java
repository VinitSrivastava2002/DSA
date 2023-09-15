package com.vinit.recursion.string;

public class Stream {
    public static void main(String[] args) {
        // removing 'a' without return statement
        skip("", "baccde");

        // removing 'a' with return statement
        System.out.println(skip("baccda"));

        // remove string (apple) from a given string
        System.out.println(skipString("bacapplecda"));

    }
    //P is denoted as processed string and UP is Unproccesed string or define String
    // Substring is return a new string that is substring of a string
    // Remove 'a' from given string and store in a new string
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

    // IN THE CASE OF RETURN THE VALUE
    static String skip(String UP){

        if(UP.isEmpty()){
            return "";
        }

        char ch=UP.charAt(0);

        if(ch=='a'){
             return skip(UP.substring(1));
        }
        else{
            return ch + skip(UP.substring(1));
        }
    }

    // Remove string from given string and store in a new string
    // remove apple from a given string
    static String skipString(String UP){

        if(UP.isEmpty()){
            return "";
        }

        if(UP.startsWith("apple")){
            return skipString(UP.substring(5));
        }
        else{
            return UP.charAt(0) + skipString(UP.substring(1));
        }
    }


}
