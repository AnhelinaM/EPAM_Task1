package by.epam.anhelinam.task1.service.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.service.ArraySortingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortingServiceImpl implements ArraySortingService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void bubbleSort(CustomArray array) throws IndexOutOfBoundsException {
        for (int i = 0; i < array.size(); ++i) {
            for (int j = 0; j < array.size() - 1 - i; ++j) {
                if (array.getElement(j) > array.getElement(j + 1)) {
                    int temp = array.getElement(j);
                    array.setElement(array.getElement(j + 1), j);
                    array.setElement(temp, j + 1);
                }
            }
        }
        logger.info("Bubble sort is finished. Sorted array is:" + array);
    }

    @Override
    public void selectionSort(CustomArray array) throws IndexOutOfBoundsException {
        for (int i = 0; i < array.size() - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < array.size(); ++j) {
                if (array.getElement(j) < array.getElement(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = array.getElement(i);
            array.setElement(array.getElement(minIndex), i);
            array.setElement(temp, minIndex);
        }
        logger.info("Selection sort is finished. Sorted array is:" + array);
    }

    @Override
    public void insertionSort(CustomArray array) throws IndexOutOfBoundsException {
        for (int i = 1; i < array.size(); ++i) {
            int element = array.getElement(i);
            int j = i - 1;
            while (j >= 0 && array.getElement(j) >= element) {
                array.setElement(array.getElement(j), j + 1);
                j--;
            }
            array.setElement(element, j + 1);
        }
        logger.info("Insertion sort is finished. Sorted array is:" + array);
    }
}

