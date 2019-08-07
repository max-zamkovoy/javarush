package com.stancialeta.task.task04;

import java.util.*;

public class Solution {

    /*
     * Создать коллекции List, Set, Queue и Map.
     * Заполнить их данными, и пройтись по каждой в цикле.
     * */

    public static void main(String[] args) {
        printList(getNames());
        printSet(getLastNames());
        printMap(getHobby());
        printQueue(getQueue());
    }

    private static void printList(List<String> list) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (String item : list) {
                System.out.println(item);
            }
        } else {
            System.out.println("List is empty");
        }
    }


    private static void printSet(Set<String> set) {
        if (CollectionUtils.isNotEmpty(set)) {
            for (String item : set) {
                System.out.println(item);
            }
        } else {
            System.out.println("Set is empty");
        }
    }

    private static void printMap(Map<String, String> map) {
        if (CollectionUtils.isNotEmpty(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        } else {
            System.out.println("Map is empty");
        }
    }

    private  static void printQueue(Queue<String> queue) {
        if (CollectionUtils.isNotEmpty(queue)) {
            for (String item : queue) {
                System.out.println(item);
            }
        } else {
            System.out.println("Queue is empty");
        }
    }

    private static List<String> getNames() {
        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Alex");
        names.add("Stas");
        return names;
    }

    private static Set<String> getLastNames() {
        Set<String> lastnames = new HashSet<>();
        lastnames.add("Zamkovoy");
        lastnames.add("Zazhogin");
        lastnames.add("Fedorov");
        return lastnames;
    }

    private static Map<String, String> getHobby() {
        Map<String, String> hobby = new HashMap<>();
        hobby.put("Surfing", "Sport");
        hobby.put("Biking", "Sport");
        hobby.put("Chess", "Sport");
        return hobby;
    }

    private  static  Queue<String> getQueue() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Consultant");
        queue.add("Developer");
        queue.add("QA Automation Engineer");
        return queue;
    }
}
