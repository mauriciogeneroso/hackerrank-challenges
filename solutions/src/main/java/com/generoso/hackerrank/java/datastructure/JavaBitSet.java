package com.generoso.hackerrank.java.datastructure;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int numberOfOperations = scan.nextInt();

        BitSet[] bitSets = new BitSet[]{new BitSet(length), new BitSet(length)};
        for (int i = 0; i < numberOfOperations; i++) {
            String operation = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();

            switch (operation) {
                case "AND":
                    bitSets[x - 1].and(bitSets[y - 1]);
                    break;
                case "OR":
                    bitSets[x - 1].or(bitSets[y - 1]);
                    break;
                case "XOR":
                    bitSets[x - 1].xor(bitSets[y - 1]);
                    break;
                case "FLIP":
                    bitSets[x - 1].flip(y);
                    break;
                case "SET":
                    bitSets[x - 1].set(y);
                    break;
            }

            System.out.printf("%s %s\n", bitSets[0].cardinality(), bitSets[1].cardinality());
        }
    }
}
