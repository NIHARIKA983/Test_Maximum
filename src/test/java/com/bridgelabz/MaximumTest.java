package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void testMaximum_Integer_At_FirstPosition_Gives_True() {
        Assert.assertEquals((Integer) 3,Maximum.maxInteger(3,2,1));
    }

    @Test
    public void testMaximum_Integer_At_SecondPosition_Gives_True() {
        Assert.assertEquals((Integer) 3,Maximum.maxInteger(2,3,1));
    }

    @Test
    public void testMaximum_Integer_At_ThirdPosition_Gives_True() {
        Assert.assertEquals((Integer)3,Maximum.maxInteger(1,2,3));
    }
}
