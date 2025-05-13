package com.generoso.hackerrank.java.datastructure;

import java.util.Scanner;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int position) {
        if (position >= game.length) {
            return true;
        }

        if (position < 0 || game[position] == 1) {
            return false;
        }

        game[position] = 1;

        return canWin(leap, game, position + leap) ||
                canWin(leap, game, position + 1) ||
                canWin(leap, game, position - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
