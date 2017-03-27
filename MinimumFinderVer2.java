package com.lmys.HomeWork.LoopsTasks.NewVersions.Conditions;


public class MinimumFinderVer2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        int c = 4;
        int min = a;

        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println(min);

    }
}

