package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        for (int b = 1; b < 11; b++) {
        a = a * b;
        }
        System.out.println(a);
    }
}
