package org.kata.fizzbuzz.rules;

public interface Rule {
    Boolean matchFor(Integer number);

    String toConvertedValue();
}
