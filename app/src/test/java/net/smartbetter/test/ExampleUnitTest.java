package net.smartbetter.test;

import org.junit.Test;

import utilslibrary.encrypt.MD5Utils;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void MD5ForBuilderTest() throws Exception {
        System.out.println(MD5Utils.encryptMD5ForBuilder("123"));
    }

    @Test
    public void MD5ForBufferTest() throws Exception {
        System.out.println(MD5Utils.encryptMD5ForBuffer("123"));
    }

}