package com.lmys.HomeWork.LoopsTasks.NewVersions.Conditions;

public class MinimumFinderTriple {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;

        if (a <= b && a <= c) {
            System.out.print(a);
        }
         else if (b <= a && b <= c) {
            System.out.print(b);
        }
        else if (c <= a && c <= b) {
            System.out.print(c);
        }

    }
}
