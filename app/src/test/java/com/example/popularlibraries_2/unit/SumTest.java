package com.example.popularlibraries_2.unit;

import com.example.popularlibraries_2.hw7.unit.Sum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    private Sum sum;

    @Before
    public void before() {
        sum = new Sum();
    }
    @Test
    public void sumIsCorrect() {
    int x = 1;
    int y = 1;
    int sum1 = sum.sum(x,y);
        Assert.assertEquals(sum1, 2);
    }
    @Test
    public void sumIsIncorrect() {
        int x = 1;
        int y = 1;
        int sum1 = sum.sum(x,y);
        Assert.assertNotEquals(sum1, 3);
    }
}
