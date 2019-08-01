package com.stancialeta.task.task02;


public class Solution {

    /*
    * Создать класс Solution с методом Main, он вызывает метод ниже передавая число
    * Создать метод который определяет больше или меньше передаваемое в него число чем 100. Результат передается в метод ниже.
    * Создать метод который положит в объект Эксперимет слово Успех если в качестве аргумента пришла правда или Неудача если ложь. Вернуть надо объект эксперимент.
    * Создать метод который примет объект эксперимент и выведет значение его единственного поля в консоль. Если это поле равно Успех, перед выводом в консоль его нужно развернуть. Пример Хепсу.
    */

    public static void main(String[] args) {
        boolean moreThanHundred = isMoreThanHundred(105);
        Experiment experiment = getExperimentResult(moreThanHundred);
        printExperiment(experiment);
    }

    private static boolean isMoreThanHundred(int number) {
       return number > 100;
    }

    private static Experiment getExperimentResult(boolean result) {
        Experiment experiment = new Experiment();
        String resultMessage = result ? "Успех" : "Неудача";
        experiment.setResult(resultMessage);
        return experiment;
    }

    private static void printExperiment(Experiment experiment) {
        // Объявить переменную типа стринг и тринарным оператором проверить оьъект эксперимент. Если поле в объекте эксперимет Успех развернуть иначе - просто положитьв переменнную
        // Вывести в консоль значение переменной, объявленной выше
        String toPrint = experiment.getResult().equals("Успех") ? reverseResult(experiment) : experiment.getResult();
        System.out.println(toPrint);
    }

    public static String reverseResult(Experiment experiment) {
        return new StringBuilder(experiment.getResult())
                .reverse()
                .toString();
    }
}
