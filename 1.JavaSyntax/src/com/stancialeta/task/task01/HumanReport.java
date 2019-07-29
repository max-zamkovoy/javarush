package com.stancialeta.task.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class HumanReport implements Report {

    public final String REVERSED_NAME_PATTERN = "Reverted name -> %s\n";
    public final String IS_MILENIAL_PATTERN = "Is he milenial -> %s\n";


    @Override
    public void create() {
        Human human = readHumanPersonalInfoFromConsole();
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

    public Human readHumanPersonalInfoFromConsole() {
        Human human = new Human();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String name = reader.readLine();
            Date birthday = DateUtils.getDate(Integer.valueOf(reader.readLine()));
            human.setName(name);
            human.setBirthday(birthday);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }
}
