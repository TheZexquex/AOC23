package dev.thezexquex.aoc23.util;

import dev.thezexquex.aoc23.AOC;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Day {
    private final Logger logger = Logger.getLogger("AOC");
    public abstract int getID();
    public abstract String getPartOneResult();
    public abstract String getPartTwoResult();

    protected List<String> getInput(int part) {
        try {
            return Files.readAllLines(Path.of(Objects.requireNonNull(AOC.class.getResource("/day" + getID() + "/Part" + part + ".txt")).toURI()));
        } catch (IOException | URISyntaxException e) {
            logger.log(Level.SEVERE, "Failed to read input for day " + getID() + " part " + part, e);
        }
        return List.of();
    }
}
