package com.jeff.research;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHello() throws Exception {
        HelloWorld hw = new HelloWorld();
        hw.sayHello();
    }

}