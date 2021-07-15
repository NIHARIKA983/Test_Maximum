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

    //...Generic Class...//

    @Test
    public void testMethod_for_Generic_Class() {
        Assert.assertEquals(java.util.Optional.of(3),java.util.Optional.of(Maximum.GenMaximumTow(1,3,2)));
        Assert.assertEquals(java.util.Optional.of(3.3f),java.util.Optional.of(Maximum.GenMaximumTow(1.1f,2.2f,3.3f)));
        Assert.assertEquals(java.util.Optional.of("Peach"),java.util.Optional.of(Maximum.GenMaximumTow("Peach","Banana","Apple")));
    }
}
