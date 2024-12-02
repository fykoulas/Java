package gr.aueb.cf.ch4;

import java.util.Scanner;

public class WorldPopulationApp {
    public static void main(String[] args) {
        double nowPopulation = 0;
        double futurePopulation = 0;
        final double RATE = 1.009;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter current population in millions: ");
        nowPopulation = in.nextDouble();

        for (int i = 1; i <= 25; i++) {
            futurePopulation = nowPopulation * RATE;
            nowPopulation = nowPopulation * RATE;
            System.out.printf("World population in " + i + " years is going to be " + "%.2f" + " millions\n", futurePopulation);
        }

    }
}
