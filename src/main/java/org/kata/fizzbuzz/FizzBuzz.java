package org.kata.fizzbuzz;

import org.kata.fizzbuzz.rules.*;

import java.util.List;

public class FizzBuzz {

    private List<Rule> rules;

    public FizzBuzz() {
        this(FizzBuzzRulesFactory.build());
    }

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public String convert(Integer number) {
        for (Rule rule: rules) {
            if (rule.matchFor(number)) {
                return rule.toConvertedValue();
            }
        }
        return number.toString();
    }

}
