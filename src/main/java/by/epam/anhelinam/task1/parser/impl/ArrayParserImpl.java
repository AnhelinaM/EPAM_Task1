package by.epam.anhelinam.task1.parser.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.parser.ArrayParser;

public class ArrayParserImpl implements ArrayParser {

    @Override
    public CustomArray parseLineParts(String[] lineParts) {
        int[] array = new int[lineParts.length];
        for (int i = 0; i < lineParts.length; i++) {
            array[i] = Integer.parseInt(lineParts[i]);
        }
        return new CustomArray(array);
    }
}
