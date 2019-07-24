package com.javarush.task.task03.task0313;

/* 
Мама мыла раму

Уж не знаем, какой садист из авторов учебников для младших классов впервые заставил маму мыть злополучную раму, но фраза эта популярна не меньше, чем «Буря мглою небо кроет». Мы в секретном центре JavaRush классику уважаем. И комбинаторику тоже уважаем. Отсюда и задание: выведите все возможные комбинации слов «Мама», «Мыла» и «Раму».
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String[] patter = {"Мама", "Мыла", "Раму"};
        for (String line : compileLines(new ArrayList<>(Arrays.asList(patter)))) {
            System.out.println(line);
        }
    }

    public static List<String> compileLines(List<String> words) {
        List<String> result = new ArrayList<>();
        if (words.size() == 1) {
            result.add(words.get(0));
            return result;
        }
        for (String word : words) {
            for (String line : compileLines(getSubList(words, word))) {
                result.add(word + line);
            }
        }
        return result;
    }

    public static List<String> getSubList(List<String> words, String leftWord) {
        List<String> subList = new ArrayList<>(words);
        subList.remove(leftWord);
        return subList;
    }
}
