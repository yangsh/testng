package com.yangsh.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Description: TODO
 * <p></p>
 * Author: shaoye
 * Date: 2019-05-10 11:12
 */
public class HelloTest {

    @Test
    public void testSayHello() {
        Hello h = new Hello();
        Assert.assertEquals(h.sayHello(), "Hello");
    }

}
