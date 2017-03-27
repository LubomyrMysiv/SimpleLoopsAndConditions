package com.lmys.HomeWork.LoopsTasks.NewVersions.Loops;

public class DigitsPrinterFromToEven {
    public static void main(String[] args) {
        int from = 6;
        int to = 100;
        if (from < to) {
            for (int i = from; i <= to; i++) {
                if (i%2 == 0)
                System.out.println(i);
            }
        }
    }
}

