package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    BalancedBrackets test_Class;
@Before
public void launchTest(){
      BalancedBrackets test_Class = new BalancedBrackets();
}

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public  void launchBracket(){
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void codeBracket(){
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void frontBracket(){
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void noBracket(){
        assertTrue(test_Class.hasBalancedBrackets(""));
    }
    @Test
    public void emptyBracket(){
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void noEndBracket(){
        assertFalse(test_Class.hasBalancedBrackets("["));
    }
    @Test
    public void noBeginBracket(){
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }
    @Test
    public void tooManyBeginBracket(){
        assertFalse(test_Class.hasBalancedBrackets("[[["));
    }
    @Test
    public void tooManyEndBracket(){
        assertFalse(test_Class.hasBalancedBrackets("]]]"));
    }
    @Test
    public void wayTooManyEndBracket(){
        assertFalse(test_Class.hasBalancedBrackets("]]]]]"));
    }
}
