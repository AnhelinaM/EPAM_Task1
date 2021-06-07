package by.epam.anhelinam.task1.reader.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.CannotReadFileException;
import by.epam.anhelinam.task1.parser.ArrayParser;
import by.epam.anhelinam.task1.reader.ArrayReader;
import by.epam.anhelinam.task1.validator.LineValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayReaderImpl implements ArrayReader {
    private static Logger logger = LogManager.getLogger();
    private static final String DELIMITER_REGEX = "\\s*[,-]?\\s+";
    private final ArrayParser arrayParser;

    public ArrayReaderImpl(ArrayParser arrayParser) {
        this.arrayParser = arrayParser;
    }

    @Override
    public CustomArray read(String fileName) throws CannotReadFileException {
        URL filePath = getClass().getClassLoader().getResource(fileName);
        try (Stream<String> stream = Files.lines(Paths.get(filePath.getFile()))) {
            List<String> lines = stream.collect(Collectors.toList());
            for (String line : lines) {
                String[] parts = line.split(DELIMITER_REGEX);
                if (!LineValidator.validateLine(parts)) {
                    continue;
                }
                return arrayParser.parseLineParts(parts);
            }
        } catch (IOException | NullPointerException e) {
            logger.error("Could not read an array: ", e);
            throw new CannotReadFileException("Could not read an array: ", e);
        }
        return null;
    }
}
