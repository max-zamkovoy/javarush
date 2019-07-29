package com.stancialeta.task.task01;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public final static int MILENIALS_BIRTHDAY_YEAR = 2000;

    public static Date getMilenialsBirthday() {
        return getDate(MILENIALS_BIRTHDAY_YEAR);
    }

    public static Date getDate(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, Calendar.JANUARY,
                Calendar.MONDAY, Calendar.ALL_STYLES, Calendar.ALL_STYLES);
        return calendar.getTime();

    }
}
