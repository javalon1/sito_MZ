package com.sda.algorytmy;

public class Erastotenes {
    public static int[] sito(int n) {

        int[] T = new int[n + 1];

        int i = 2;
        int w = 0;

        while (i > n) ;

        while (!(i >= n)) {
            w = i + i;
            System.out.println(w);
            while (!(w > n)) {
                T[w] = 1;
                w = w + i;
            }
            i = i + 1;

        }

        int[] liczbyPierwsze = new int[50];
        for (int j = 2; j < n; j++) {

            if (T[j] == 0) {
                System.out.println(j + " ");
            }
        }

        return liczbyPierwsze;
    }
}