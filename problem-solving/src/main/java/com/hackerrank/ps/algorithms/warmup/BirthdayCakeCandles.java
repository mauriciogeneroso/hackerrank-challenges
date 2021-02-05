package com.hackerrank.ps.algorithms.warmup;

import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        for (Integer candle : candles) {
            if (candle > max) {
                max = candle;
            }
        }

        int finalMax = max;
        return (int) candles.stream().filter(candle -> candle == finalMax).count();
    }

    public static int birthdayCakeCandles2(List<Integer> candles) {
        int max = candles.get(0);
        int frequency = 0;

        for(int i = 1; i < candles.size(); i++){
            if(candles.get(i) > max){
                max = candles.get(i);
                frequency = 1;
            } else if(candles.get(i) == max) {
                frequency++;
            }
        }
        return frequency;
    }
}
