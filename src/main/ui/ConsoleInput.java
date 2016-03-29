package main.ui;

/**
 * Created by DM53848 on 3/25/2016.
 * JS54004
 */
public interface ConsoleInput {
    int getInt(String prompt);

    int getIntWithinRange(String prompt, int min, int max);

    double getDouble(String prompt);

    double getDoubleWithinRange(String prompt, double min, double max);

    String getRequiredString(String prompt);

    String getChoiceString(String prompt, String s1, String s2);

    String getChoiceArray(String prompt, String[] array);
}
