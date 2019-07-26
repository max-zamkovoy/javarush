package com.stancialeta.task.task01;

import java.util.Date;

public class Solution {
    /*
    * Создать main метод который вызовет единственный метод ниже
    * Создать метод который считает с консоли дату рождения и имя и выведет их на экран. Данный метод поместить в отдельный класс
    * Создать класс Человек который будет хранить имя и возраст
    * Создать метод который будет изменять имя наоборот принимая объект Человек
    * Создать метод который будет определять являешь ли ты миллениалом, тоесть родился после 2000 принимая объект Человек
    * */

    public static void main(String[] args) {
        Human human = new Human("Vasya", new Date()); //TODO
        Report humanReport = new HumanReport();
        humanReport.create(human);
    }
}
