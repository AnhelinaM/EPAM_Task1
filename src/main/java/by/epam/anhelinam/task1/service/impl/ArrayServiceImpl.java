package by.epam.anhelinam.task1.service.impl;

import by.epam.anhelinam.task1.entity.CustomArray;
import by.epam.anhelinam.task1.exception.ArrayServiceException;
import by.epam.anhelinam.task1.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class ArrayServiceImpl implements ArrayService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int min(CustomArray array) throws ArrayServiceException {
        OptionalInt minElement = array.stream().min();
        if (minElement.isPresent()) {
            logger.info("Min element: " + minElement.getAsInt());
            return minElement.getAsInt();
        } else {
            logger.warn("No min element");
            throw new ArrayServiceException("No min element");
        }
    }

    @Override
    public int max(CustomArray array) throws ArrayServiceException {
        OptionalInt maxElement = array.stream().max();
        if (maxElement.isPresent()) {
            logger.info("Max element: " + maxElement.getAsInt());
            return maxElement.getAsInt();
        } else {
            logger.warn("No max element");
            throw new ArrayServiceException("No max element");
        }
    }

    @Override
    public void replace(CustomArray array, int replacement, Predicate<Integer> predicate) {
        array.setArray(array.stream().map(element -> predicate.test(element) ? replacement : element).toArray());
        logger.info("New array: " + array);
    }

    @Override
    public double mean(CustomArray array) throws ArrayServiceException {
        OptionalDouble meanValue = array.stream().average();
        if (meanValue.isPresent()) {
            logger.info("Mean: " + meanValue.getAsDouble());
            return meanValue.getAsDouble();
        } else {
            logger.warn("No elements");
            throw new ArrayServiceException("No elements");
        }
    }

    @Override
    public int sum(CustomArray array) {
        logger.info("Sum: " + array.stream().sum());
        return array.stream().sum();
    }

    @Override
    public long countNegative(CustomArray array) {
        logger.info("Counting negative elements... ");
        return array.stream().filter((element) -> element < 0).count();
    }

    @Override
    public long countPositive(CustomArray array) {
        logger.info("Counting positive elements... ");
        return array.stream().filter((element) -> element > 0).count();
    }
}
