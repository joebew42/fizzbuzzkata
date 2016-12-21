package org.kata.fizzbuzz.rules;

public class FizzWhenContainsAThree implements Rule {
    public Boolean matchFor(Integer number) {
        return number.toString().contains("3");
    }

    public String toConvertedValue() {
        return "fizz";
    }
}
