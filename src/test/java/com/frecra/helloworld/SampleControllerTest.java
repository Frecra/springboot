package com.frecra.helloworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleControllerTest {

    @Test
    public void simpleUnitTest() {

        assertEquals("Hello World!", (new SampleController()).home());
    }

}
