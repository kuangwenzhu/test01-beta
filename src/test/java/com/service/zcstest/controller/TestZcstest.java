package com.service.zcstest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestZcstest {

        ZcstestDelegate zcstestDelegate = new ZcstestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = zcstestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}