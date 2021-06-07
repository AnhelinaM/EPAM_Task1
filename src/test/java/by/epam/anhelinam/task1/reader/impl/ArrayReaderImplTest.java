package by.epam.anhelinam.task1.reader.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.CannotReadFileException;
import by.epam.anhelinam.task1.parser.impl.ArrayParserImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayReaderImplTest {

    private final ArrayReaderImpl arrayReader = new ArrayReaderImpl(new ArrayParserImpl());

    @Test
    public void readTest() throws CannotReadFileException {
        String filePath = "input.txt";
        CustomArray array = arrayReader.read(filePath);
        assertEquals(array, new CustomArray(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
    }
}
