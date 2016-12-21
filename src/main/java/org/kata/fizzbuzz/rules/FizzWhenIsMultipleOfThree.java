package org.kata.fizzbuzz.rules;

public class FizzWhenIsMultipleOfThree implements Rule {
    public Boolean matchFor(Integer number) {
        return number > 0 && number % 3 == 0;
    }

    public String toConvertedValue() {
        return "fizz";
    }
}
