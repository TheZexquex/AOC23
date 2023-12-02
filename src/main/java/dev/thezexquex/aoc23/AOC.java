package dev.thezexquex.aoc23;

import dev.thezexquex.aoc23.days.Day1;
import dev.thezexquex.aoc23.util.ResultPrinter;

import java.util.logging.Logger;

public class AOC {
    private final Logger logger = Logger.getLogger("AOC");

    public void printDays() {
        ResultPrinter.printResultsForDay(new Day1());
        // ...
    }
}
