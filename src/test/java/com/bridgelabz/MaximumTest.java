package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    // .....Generic methods.....//

    //.....Integer.....//
    @Test
    public void testMethod_for_Generic_method(){
        Integer result = Maximum.GenMaximum(1,3,2);
        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(result));
    }
    //.....Float.....//
    @Test
    public void testMethod_for_Generic_methodTwo() {
        Float result = Maximum.GenMaximum(1.1f,3.3f,2.2f);
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(result));
    }
    //.....string.....//
    @Test
    public void testMethod_for_Generic_methodThree() {
        String result = Maximum.GenMaximum("Apple","Peach","Banana");
        Assert.assertEquals(java.util.Optional.of("Peach"),java.util.Optional.of(result));
    }
    //...Genric Class...//

    @Test
    public void testMethod_for_Generic_Class() {
        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(Maximum.GenMaximumTow(1,3,2)));
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(Maximum.GenMaximumTow(1.1f,2.2f,3.3f)));
        Assert.assertEquals(java.util.Optional.of("Peach"),java.util.Optional.of(Maximum.GenMaximumTow("Peach","Banana","Apple")));


    }

    //.....UC4......//
    @Test
    public void findMaximum_Integer_At_FirstPosition_Gives_True() {
        Integer[] arr = {5,2,3,4,1};
        Integer result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(5),java.util.Optional.of(result));
    }

    @Test
    public void findMaximum_Integer_At_SecondPosition_Gives_True() {
        Integer[] arr = {1,5,3,4,2};
        Integer result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(5),java.util.Optional.of(result));
    }

    @Test
    public void findMaximum_Integer_At_ThirdPosition_Gives_True() {
        Integer[] arr = {1,2,5,4,3};
        Integer result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(5),java.util.Optional.of(result));
    }

    //.........FLoat.......//

    @Test
    public void findMaximum_Float_At_FirstPosition_Gives_True() {
        Float[] arr = {3.3f,2.2f,1.1f,2.1f};
        Float result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(result));
    }

    @Test
    public void find_Maximum_Float_At_SecondPosition_Gives_True() {
        Float[] arr = {1.1f,3.3f,2.2f,1.1f};
        Float result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(result));
    }

    @Test
    public void find_Maximum_Float_At_ThirdPosition_Gives_True() {
        Float[] arr = {1.1f,2.3f,3.3f,3.0f};
        Float result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(result));
    }

    @Test
    public void find_Maximum_String_At_firstPosition_Gives_True() {
        String[] arr = {"peach","Apple","banana","Orange","Strawberry"};
        String result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of("peach"),java.util.Optional.of(result));
    }

    @Test
    public void find_Maximum_String_At_SecondPosition_Gives_True() {
        String[] arr = {"Apple","peach","banana","Orange","Strawberry"};
        String result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of("peach"),java.util.Optional.of(result));
    }

    @Test
    public void find_Maximum_String_At_ThirdPosition_Gives_True() {
        String[] arr = {"Apple","peach","banana","Orange","Strawberry"};
        String result = Maximum.maximum(arr);
        Assert.assertEquals(java.util.Optional.of("peach"),java.util.Optional.of(result));
    }
}
