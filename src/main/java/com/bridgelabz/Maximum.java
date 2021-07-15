package com.bridgelabz;

public class Maximum {
    public static<E extends Comparable> E GenMaximum( E firstValue, E secondValue, E thirdValue) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }
}
