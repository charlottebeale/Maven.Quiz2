package com.zipcodewilmington.assessment2.part1;
import java.util.stream.IntStream;
import java.lang.Integer;


public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return array.length % 2 == 0;
    }

    public Integer[] range(int start, int stop) {
        return IntStream.rangeClosed(start, stop).boxed().toArray(Integer[]::new);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length-2] * array[array.length-1];
    }
}
