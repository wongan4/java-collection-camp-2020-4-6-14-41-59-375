package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;

        for (Integer number : arrayList) {
            if (number % 2 != 0) {
                sum += number * 3 + 5;
            }
        }

        return sum;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();

        for (Integer number : arrayList) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
            else {
                oddList.add(number);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());
        resultList.addAll(evenList);
        resultList.addAll(oddList);

        return resultList;
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        if (specialElement % 2 != 0) {
            return false;
        }

        for (Integer number : arrayList) {
            if (number == specialElement) {
                return true;
            }
        }

        return false;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<Integer>();

        for (Integer number : arrayList) {
            if (number % 2 != 0) {
                resultList.add(number * 3 + 2);
            }
            else {
                resultList.add(number);
            }
        }

        return resultList;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;

        for (Integer number : arrayList) {
            sum += number * 3 + 2;
        }

        return sum;
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;

        if (leftBorder > rightBorder) {
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }

        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;

        if (leftBorder > rightBorder) {
            int tmp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = tmp;
        }

        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }

}
