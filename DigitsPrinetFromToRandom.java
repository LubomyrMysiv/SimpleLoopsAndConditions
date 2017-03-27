package com.lmys.HomeWork.LoopsTasks.NewVersions.Loops;

public class DigitsPrinetFromToRandom {
    public static void main(String[] args) {
        int from = 20;
        int to = 5;
        if (from <= to) {
            for (int i = from; i <= to; i++) {

                System.out.println(i);
            }
        } if (to<=from) {
            for (int i = from; i >= to; i--) {

                System.out.print(i + " ");
            }
        }
    }
}




