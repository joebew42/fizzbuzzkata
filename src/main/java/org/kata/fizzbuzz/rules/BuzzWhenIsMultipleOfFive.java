package org.kata.fizzbuzz.rules;

public class BuzzWhenIsMultipleOfFive implements Rule {
    public Boolean matchFor(Integer number) {
        return number > 0 && number % 5 == 0;
    }

    public String toConvertedValue() {
        return "buzz";
    }
}
