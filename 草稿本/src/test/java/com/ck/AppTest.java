package com.ck;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test01(){
        String str="123456789";
        System.out.println(str.indexOf("5"));
    }

    @Test
    public void test02(){
        Integer i1 = 127;
        Integer i3 = 128;
        Integer i2 = 127;
        Integer i4 = 128;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
    }

    @Test
    public void test03(){
        int a = Integer.parseInt("123");
        System.out.println(123+a);
    }
}
