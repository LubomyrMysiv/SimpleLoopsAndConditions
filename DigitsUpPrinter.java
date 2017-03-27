package com.lmys.HomeWork.LoopsTasks.NewVersions.Conditions;

public class DigitsUpPrinter {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int min = Math.min(a, Math.min(b,c)) ;
        int max = Math.max (a, Math.max(b,c));
        int mid = Math.min(max, Math.max(a, Math.min(b,c)));

         System.out.println(min + " " + mid + " " + max);

    }

}

