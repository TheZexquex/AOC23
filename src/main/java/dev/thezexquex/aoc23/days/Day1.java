package dev.thezexquex.aoc23.days;

import dev.thezexquex.aoc23.util.Day;

import java.util.*;
import java.util.stream.Collectors;

public class Day1 extends Day {
    private final Map<String, Integer> digits = new HashMap<>();

    public Day1() {
        fillMap();
    }

    private void fillMap() {
        for (int i = 1; i <= 9; i++) {
            digits.put(String.valueOf(i), i);
        }

        digits.put("one", 1);
        digits.put("two", 2);
        digits.put("three", 3);
        digits.put("four", 4);
        digits.put("five", 5);
        digits.put("six", 6);
        digits.put("seven", 7);
        digits.put("eight", 8);
        digits.put("nine", 9);
    }

    @Override
    public int getID() {
        return 1;
    }

    @Override
    public String getPartOneResult() {
        return String.valueOf(getInput(1).stream().map(s -> {
                    var list = new ArrayList<>();
                    for (int i = 0; i < s.length(); i++) {
                        if (Character.isDigit(s.charAt(i))) {
                            list.add(s.charAt(i));
                        }
                    }
                    return list.isEmpty() ? "0" : "" + list.get(0) + list.get(list.size() - 1);
                }).mapToLong(Long::parseLong).sum()
        );
    }

    @Override
    public String getPartTwoResult() {
        return String.valueOf(getInput(1).stream().map(s -> {
            var indexMap = new HashMap<Integer, String>();
            digits.keySet().forEach(stringDigit -> indexMap.put(s.indexOf(stringDigit), stringDigit));
            var first = digits.get(indexMap.get(indexMap.keySet().stream().filter(i -> i != -1).min(Comparator.naturalOrder()).get()));
            indexMap.clear();
            digits.keySet().forEach(stringDigit -> indexMap.put(s.lastIndexOf(stringDigit), stringDigit));
            var last = digits.get(indexMap.get(indexMap.keySet().stream().max(Comparator.naturalOrder()).get()));
            return "" + first + last;
        }).mapToInt(Integer::parseInt).sum());
    }
}

