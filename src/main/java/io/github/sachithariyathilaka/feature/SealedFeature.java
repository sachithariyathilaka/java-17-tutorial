package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java17Tutorial;
import io.github.sachithariyathilaka.entity.Bus;
import io.github.sachithariyathilaka.entity.Car;

/**
 * Sealed feature implementation class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/04/20
 */
public class SealedFeature {

    public static void execute() {
        try {
            Car car = new Car();
            Bus bus = new Bus();

            Java17Tutorial.print("Sealed class working for permitted classes");
        } catch (Exception exception) {
            Java17Tutorial.print(exception.getMessage());
        }
    }
}
