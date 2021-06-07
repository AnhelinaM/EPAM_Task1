package by.epam.anhelinam.task1.service;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.ArrayServiceException;

import java.util.function.Predicate;

public interface ArrayService {
    int min(CustomArray array) throws ArrayServiceException;

    int max(CustomArray array) throws ArrayServiceException;

    void replace(CustomArray array, int replacement, Predicate<Integer> predicate);

    double mean(CustomArray array) throws ArrayServiceException;

    int sum(CustomArray array);

    long countNegative(CustomArray array);

    long countPositive(CustomArray array);
}
