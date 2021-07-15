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

    @Test
    public void testFloat_Integer_At_FirstPosition_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(3.3f,2.2f,1.1f));
    }

    @Test
    public void testFloat_Integer_At_SecondPosition_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(1.1f,3.3f,2.2f));
    }

    @Test
    public void testFloat_Integer_At_ThirdPosition_Gives_True() {
        Assert.assertEquals((Float)3.3f,Maximum.myFloat(1.1f,2.2f,3.3f));
    }
}
