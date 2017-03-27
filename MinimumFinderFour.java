package com.lmys.HomeWork.LoopsTasks.NewVersions.Conditions;

public class MinimumFinderFour {
    public static void main(String[] args) {
       int a = 1;
       int b = 1;
       int c = 1;
       int d = 1;

       if (a<=b && a <=c && a<=d) {
           System.out.println(a);}
           else if (b<=a && b<=c && b<=d) {
           System.out.println(b);}
           else if (c<=a && c<=b && c<=d) {
           System.out.println(c);}
        else if (d<=a && d<=b && d<=c) {
            System.out.println(d);}
    }
}
