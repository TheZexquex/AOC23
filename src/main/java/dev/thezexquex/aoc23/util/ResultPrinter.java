package dev.thezexquex.aoc23.util;

public class ResultPrinter {

    public static void printResultsForDay(Day day) {
        var id = day.getID();
        System.out.println("Day " + id + " part one: " + day.getPartOneResult());
        System.out.println("Day " + id + " part two: " + day.getPartTwoResult());
    }
}
