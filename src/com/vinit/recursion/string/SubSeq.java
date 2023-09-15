package com.vinit.recursion.string;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str="abc";
//        subSeqAscii("",str);
        System.out.println(subSeqAsciiList("",str));
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p,up.substring(1));
    }

//    Return subsequence in a ArrayList
    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subSeqList(p+ch, up.substring(1));
        ArrayList<String> right=subSeqList(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    // return subsequence with ascii value
    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ',');
            return;
        }
        char ch=up.charAt(0);
        subSeqAscii(p+ch, up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
    }

    // return subequene with ascii value in array list
    static ArrayList<String> subSeqAsciiList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> first=subSeqAsciiList(p+ch, up.substring(1));
        ArrayList<String> second=subSeqAsciiList(p,up.substring(1));
        ArrayList<String> third=subSeqAsciiList(p + (ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
