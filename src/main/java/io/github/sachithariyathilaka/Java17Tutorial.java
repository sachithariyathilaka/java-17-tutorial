package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.feature.*;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/04/20
 */
public class Java17Tutorial {

    public static void main(String[] args) {

        // Sealed feature
        SealedFeature.execute();

        // Switch statement expression feature
        SwitchStatementExpressionFeature.execute();

        // Nullable switch case feature
        NullableSwitchCaseFeature.execute();

        // record feature
        RecordFeature.execute();
    }

    /**
     * Print the message.
     *
     * @param   message the message
     */
    public static void print(String message) {
        System.out.println(message);
    }
}
