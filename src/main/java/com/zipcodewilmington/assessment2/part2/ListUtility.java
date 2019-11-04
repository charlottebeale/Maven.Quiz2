package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.lang.Integer;


public class ListUtility {
    ArrayList<Integer> list = new ArrayList<>(0);


    public Boolean add(int i) {
        if (i > 0) {
            return list.add(i);
        } return null;
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        return new ArrayList<>(new HashSet<>(list));
    }

    public String join() {
        String concat = list.toString();

        return concat.substring(1, concat.length() - 1);
    }

    public Integer mostCommon() {

        Integer[] d = list.toArray(new Integer[list.size()]);

        return new ArrayUtility().mostCommon(d);
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
