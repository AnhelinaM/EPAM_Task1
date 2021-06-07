package by.epam.anhelinam.task1.reader;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.CannotReadFileException;

public interface ArrayReader {
    CustomArray read(String filePath) throws CannotReadFileException;
}
