package by.epam.anhelinam.task1.service.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraySortingServiceImplTest {

    private final ArraySortingServiceImpl arraySortingService = new ArraySortingServiceImpl();

    @Test
    public void bubbleSortTest() throws IndexOutOfBoundsException {
        CustomArray array = new CustomArray(3, 1, 2, 5, 4);
        arraySortingService.bubbleSort(array);
        assertEquals(array, new CustomArray(1, 2, 3, 4, 5));
    }

    @Test
    public void selectionSortTest() throws IndexOutOfBoundsException {
        CustomArray array = new CustomArray(0, 4, -3, -1, 2);
        arraySortingService.selectionSort(array);
        assertEquals(array, new CustomArray(-3, -1, 0, 2, 4));
    }

    @Test
    public void insertionSortTest() throws IndexOutOfBoundsException {
        CustomArray array = new CustomArray(3, 1, 2, -3, -1, -2);
        arraySortingService.insertionSort(array);
        assertEquals(array, new CustomArray(-3, -2, -1, 1, 2, 3));
    }
}
