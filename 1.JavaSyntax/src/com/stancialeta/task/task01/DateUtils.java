package com.stancialeta.task.task01;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public final static int MILENIALS_BIRTHDAY_YEAR = 2000;

    public static Date getMilenialsBirthday() {
        Calendar milenialsBirthday = Calendar.getInstance();
        milenialsBirthday.set(MILENIALS_BIRTHDAY_YEAR, Calendar.JANUARY,
                Calendar.MONDAY, Calendar.ALL_STYLES, Calendar.ALL_STYLES);
        return milenialsBirthday.getTime();
    }
}
