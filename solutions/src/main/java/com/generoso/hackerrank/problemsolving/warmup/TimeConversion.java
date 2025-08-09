package com.generoso.hackerrank.problemsolving.warmup;

public class TimeConversion {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));

        StringBuffer sb = new StringBuffer();
        if (s.contains("PM")) {
            sb.append(hour == 12 ? hour : hour + 12);
        } else {
            if (hour == 12) {
                sb.append("00");
            } else if (hour < 10) {
                sb.append("0").append(hour);
            }
        }

        return sb.append(s, 2, s.length() - 2).toString();
    }
}
