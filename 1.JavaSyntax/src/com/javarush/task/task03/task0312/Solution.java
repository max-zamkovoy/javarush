package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {

    public static void main(String[] args) {

        int secondsPerDay = convertToSeconds(DateConstants.HOURS_PER_DAY);
        System.out.println(secondsPerDay);
        System.out.println(convertToSeconds(DateConstants.HOURS_PER_WEEK));
    }

    public static int convertToSeconds(int hour) {
        return hour * DateConstants.SECONDS_PER_HOUR;
    }
}