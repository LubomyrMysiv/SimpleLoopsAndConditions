package com.lmys.HomeWork.LoopsTasks.NewVersions.Conditions;


public class MinimumFinderFourVer2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 2;
        int d = 1;
        int min = a;

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        if (min > d) {
            min = d;
        }
        System.out.println(min);

    }
}

