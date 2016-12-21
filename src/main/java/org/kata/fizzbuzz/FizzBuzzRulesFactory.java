package org.kata.fizzbuzz;

import org.kata.fizzbuzz.rules.*;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzRulesFactory {
    static List<Rule> build() {
        return Arrays.asList(
                    new FizzBuzzWhenIsMultipleOfThreeAndFive(),
                    new FizzWhenContainsAThree(),
                    new BuzzWhenContainsAFive(),
                    new FizzWhenIsMultipleOfThree(),
                    new BuzzWhenIsMultipleOfFive()
            );
    }
}
