package by.epam.anhelinam.task1.entity;

import by.epam.anhelinam.task1.exception.NegativeSizeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomArray {
    private int[] array;
    private static Logger logger = LogManager.getLogger();

    public CustomArray(int size) throws NegativeSizeException {
        if (size < 0) {
            logger.error("Size can't be " + size);
            throw new NegativeSizeException("Size can't be " + size);
        }
        array = new int[size];
    }

    public CustomArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int size() {
        return array.length;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int getElement(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.array.length) {
            logger.error("Index out of bounds!");
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        return array[index];
    }

    public void setElement(int element, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.array.length) {
            logger.error("Index out of bounds!");
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        array[index] = element;
    }

    public IntStream stream() {
        return Arrays.stream(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
