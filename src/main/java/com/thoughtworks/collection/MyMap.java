package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> resultList = new ArrayList<Integer>();

        for (Integer number : this.array) {
            resultList.add(number * 3);
        }

        return resultList;
    }

    public List<String> mapLetter() {
        List<String> resultList = new ArrayList<String>();

        for (Integer number : this.array) {
            resultList.add(letters[number - 1]);
        }

        return resultList;
    }

    public List<Integer> sortFromBig() {
        List<Integer> resultList = new ArrayList<Integer>(this.array);
        Collections.sort(resultList, Collections.reverseOrder());
        return resultList;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> resultList = new ArrayList<Integer>(this.array);
        Collections.sort(resultList);
        return resultList;
    }
}
