package by.epam.anhelinam.task1.service;

import by.epam.anhelinam.task1.entity.CustomArray;

public interface ArraySortingService {
    void bubbleSort(CustomArray array) throws IndexOutOfBoundsException;

    void selectionSort(CustomArray array) throws IndexOutOfBoundsException;

    void insertionSort(CustomArray array) throws IndexOutOfBoundsException;
}

