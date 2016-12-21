package org.kata.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void convert_each_number_to_its_string_value() {
        assertEquals("0", fizzBuzz.convert(0));
        assertEquals("1", fizzBuzz.convert(1));
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void convert_each_number_that_is_multiple_of_three_to_fizz() {
        assertEquals("fizz", fizzBuzz.convert(3));
        assertEquals("fizz", fizzBuzz.convert(6));
        assertEquals("fizz", fizzBuzz.convert(9));
    }

    @Test
    public void convert_each_number_that_contains_a_three_to_fizz() {
        assertEquals("fizz", fizzBuzz.convert(3));
        assertEquals("fizz", fizzBuzz.convert(13));
        assertEquals("fizz", fizzBuzz.convert(31));
    }

    @Test
    public void convert_each_number_that_is_multiple_of_five_to_buzz() {
        assertEquals("buzz", fizzBuzz.convert(5));
        assertEquals("buzz", fizzBuzz.convert(10));
        assertEquals("buzz", fizzBuzz.convert(20));
    }

    @Test
    public void convert_each_number_that_contains_a_five_to_buzz() {
        assertEquals("buzz", fizzBuzz.convert(5));
        assertEquals("buzz", fizzBuzz.convert(51));
        assertEquals("buzz", fizzBuzz.convert(151));
    }

    @Test
    public void convert_each_number_that_is_multiple_of_three_and_five_to_fizzbuzz() {
        assertEquals("fizzbuzz", fizzBuzz.convert(15));
        assertEquals("fizzbuzz", fizzBuzz.convert(30));
        assertEquals("fizzbuzz", fizzBuzz.convert(45));
    }
}
