package org.example.java_jenkins_in_docker2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TestMain 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testInputIsEven()
    {
        assertTrue( Main.checkIfInputIsAnEvenNumber(122) );
    }
}
