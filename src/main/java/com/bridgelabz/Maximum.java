package com.bridgelabz;

public class Maximum {
    public static Integer maxInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {

        Integer max = firstValue;
        if(secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }
    public static Float myFloat(Float firstValue, Float secondValue, Float thirdValue){
        Float max = firstValue;
        if(secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        return max;
    }
}
