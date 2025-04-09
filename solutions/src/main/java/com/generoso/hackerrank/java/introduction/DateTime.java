package com.generoso.hackerrank.java.introduction;

import java.util.Calendar;
import java.util.Locale;

public class DateTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month - 1, day);
//        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()).toUpperCase();

        return java.time.LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
