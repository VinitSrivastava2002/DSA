package com.vinit.leetcode;

public class Longest_Substring_3 {
    public static void main(String[] args) {
        //aab
        String s="au";
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s) {
        int max=1;
        int k=0;
        if(s.length()==2){
            if(s.charAt(k)!=s.charAt(k+1)){
                max=s.length();
                return max;
            }

        }
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
//        str.append(s.charAt(1));
        for(int i=1;i<s.length();i++){
            if(duplicate(str)){
                str.deleteCharAt(0);
                str.append(s.charAt(i));
            }
            else{
                max=Math.max(max,str.length());
                str.append(s.charAt(i));
            }
        }
        return max;
    }
    static boolean duplicate(StringBuilder str){
        if(str.length()==1){
            return false;
        }
        for(int j=0;j<str.length()-1;j++){
            for(int k=j+1;k<str.length();k++){
                if(str.charAt(j)==str.charAt(k)){
                    return true;
                }
            }
        }
        return false;
    }
}
