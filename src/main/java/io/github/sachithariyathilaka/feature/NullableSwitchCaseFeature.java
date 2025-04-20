package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java17Tutorial;

import java.util.Arrays;
import java.util.List;

/**
 * Nullable switch case feature implementation class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/04/20
 */
public class NullableSwitchCaseFeature {

    public static void execute() {
        List<String> titles = Arrays.asList("MR", "MASTER", "MRS", "MISS", "Other", null);
        titles.forEach(title -> {
            switch (title) {
                case "MR", "MATER" -> Java17Tutorial.print(title + " is male title");
                case "MRS", "MISS" -> Java17Tutorial.print(title + " is female title");
                case null -> Java17Tutorial.print(null + " is not a valid title");
                default -> Java17Tutorial.print(title + " is an other title");
            }
        });
    }
}
