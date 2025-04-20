package io.github.sachithariyathilaka.feature;

import io.github.sachithariyathilaka.Java17Tutorial;
import io.github.sachithariyathilaka.entity.Person;

/**
 * Record feature implementation class.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2025/04/20
 */
public class RecordFeature {

    public static void execute() {
        try {
            Person person = new Person("Sachith Ariyathilaka", 29);
            Java17Tutorial.print("Name: " + person.name() + " & Age: " + person.age());
        } catch (Exception exception) {
            Java17Tutorial.print(exception.getMessage());
        }
    }
}
