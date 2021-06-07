package by.epam.anhelinam.task1.service.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.ArrayServiceException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayServiceImplTest {

    private final ArrayServiceImpl arrayService = new ArrayServiceImpl();

    @Test
    public void minPositiveTest() throws ArrayServiceException {
        CustomArray array = new CustomArray(3, 1, 2);
        assertEquals(arrayService.min(array), 1);
    }

    @Test(expectedExceptions = ArrayServiceException.class)
    public void minExceptionTest() throws ArrayServiceException {
        CustomArray array = new CustomArray();
        arrayService.min(array);
    }

    @Test
    public void maxPositiveTest() throws ArrayServiceException {
        CustomArray array = new CustomArray(-3, 1, 2);
        assertEquals(arrayService.max(array), 2);
    }

    @Test(expectedExceptions = ArrayServiceException.class)
    public void maxExceptionTest() throws ArrayServiceException {
        CustomArray array = new CustomArray();
        arrayService.max(array);
    }

    @Test
    public void meanPositiveTest() throws ArrayServiceException {
        CustomArray array = new CustomArray(-3, 1, 5, 1);
        assertEquals(arrayService.mean(array), 1);
    }

    @Test(expectedExceptions = ArrayServiceException.class)
    public void meanExceptionTest() throws ArrayServiceException {
        CustomArray array = new CustomArray();
        arrayService.mean(array);
    }

    @Test
    public void sumTest() throws ArrayServiceException {
        CustomArray array = new CustomArray(3, 1, -3, 5, -2, 0);
        assertEquals(arrayService.sum(array), 4);
    }

    @Test
    public void sumTestIfArrayIsEmpty() throws ArrayServiceException {
        CustomArray array = new CustomArray();
        assertEquals(arrayService.sum(array), 0);
    }

    @Test
    public void countNegativeValuesTest() {
        CustomArray array = new CustomArray(-3, 1, -5, -4, 0, 7, 2);
        assertEquals(arrayService.countNegative(array), 3);
    }

    @Test
    public void countPositiveValuesTest() {
        CustomArray array = new CustomArray(-3, 1, 0, 5, -4, 0, 7, 2);
        assertEquals(arrayService.countPositive(array), 4);
    }

    @Test
    public void replaceTest() {
        CustomArray array = new CustomArray(-3, 1, 0, 5, -9, 0, 7, 2, 15, 3, -4, 0, 12);
        arrayService.replace(array, 2021, element -> element % 3 == 0);
        assertEquals(array, new CustomArray(2021, 1, 2021, 5, 2021, 2021, 7, 2, 2021, 2021, -4, 2021, 2021));
    }
}