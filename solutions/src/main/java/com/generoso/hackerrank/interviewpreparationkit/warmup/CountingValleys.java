package com.generoso.hackerrank.interviewpreparationkit.warmup;

public class CountingValleys  {

    public int countingValleys(int steps, String path) {
        int valleysCounting = 0;

        // 0 - sea level
        // negative number - valley
        // positive number - mountain
        int currentLocation = 0;

        for (int i = 0 ; i < path.length(); i++) {
            char step = path.charAt(i);

            if (step == 'U') {
                currentLocation++;
            } else if (step == 'D') {
                if (currentLocation == 0) {
                    valleysCounting++;
                }
                currentLocation--;
            }
        }

        return valleysCounting;
    }
}
