package by.epam.anhelinam.task1.validator;

public abstract class LineValidator {
    private static final String NUMBER_REGEX = "-?\\d+";

    public static boolean validateLine(String[] parts) {
        for (String part : parts) {
            if (!part.matches(NUMBER_REGEX)) {
                return false;
            }
        }
        return true;
    }
}
