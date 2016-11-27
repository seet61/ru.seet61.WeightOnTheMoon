package ru.seet61.WeightOnTheMoon;

/**
 * Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.
 * Created by dmitry.arefyev on 27.11.2016.
 */

public class WeightOnTheMoon {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Использование: java ru.seet61.WeightOnTheMoon.WeightOnTheMoon <Ваш вес>");
            System.exit(1);
        }

        System.out.println("Добро пожаловать!");
        System.out.println("Ваш вес на Земле равен(кг.): " + args[0]);
        System.out.println("Ваш вес на Луне составит(кг.): " + Integer.valueOf(args[0])*0.17);
        System.out.println("Удачи в расчетах! :)");
    }
}

