package org.kata.fizzbuzz.rules;

public class BuzzWhenContainsAFive implements Rule {
    public Boolean matchFor(Integer number) {
        return number.toString().contains("5");
    }

    public String toConvertedValue() {
        return "buzz";
    }
}
