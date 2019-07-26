package com.stancialeta.task.task01;

public class HumanReport implements Report {

    public final String REVERSED_NAME_PATTERN = "Reverted name -> %s\n";
    public final String IS_MILENIAL_PATTERN = "Is he milenial -> %s\n";


    public void create(Human human) {
        System.out.printf(REVERSED_NAME_PATTERN, reverseName(human));
        System.out.printf(IS_MILENIAL_PATTERN, isMillenial(human));
    }

    public static boolean isMillenial(Human human) {
        int differentBetweenDates = 0;
        return human.getBirthday().compareTo(DateUtils.getMilenialsBirthday()) > differentBetweenDates;

    }

    public String reverseName(Human human) {
        return new StringBuilder(human.getName())
                .reverse()
                .toString();
    }
}
