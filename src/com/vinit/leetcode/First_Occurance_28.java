package com.vinit.leetcode;
//Find the Index of the First Occurrence in a String
public class First_Occurance_28 {
    public static void main(String[] args) {
        String str="mooother";
        String needle="th";
        System.out.println(strStr(str, needle));

    }
    static int strStr(String haystack, String needle) {
        int index=-1;
        int j=0;
        if(needle.length()==0){
            return 0;
        }

        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(index==-1){
                    index=i;
                }
                j++;
                if(j==needle.length()){
                    return index;
                }
            }
            else{
                if(index!=-1){
                    i=index;
                    index=-1;
                }
                j=0;
            }
        }
        return -1;

    }
    static int strStr1(String haystack, String needle){
        int count=0;
        if(needle.length()==0){
            return 0;
        }
        while(haystack.isEmpty() || haystack.startsWith(needle)){
            if(!haystack.startsWith(needle)){
                count++;
            }
            haystack.substring(1);
            if(haystack.startsWith(needle)){
                return count;

            }

        }
        return -1;
    }
}
