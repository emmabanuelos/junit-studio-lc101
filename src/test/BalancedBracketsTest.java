package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    //if the brackets dont start at 0
    @Test
    public void bracketsNotAtZero () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertEquals(0, 0) ;
    }
    //if the brackets start with a closing bracket
    @Test
    public void stringStartWithClosingBracket () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]"));
    //you have to put the object, what you are testing which is test_Class

    }

    //if the brackets end with a starting bracket
    @Test
    public void stringEndsWithOpeningBracket () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("["));
    }
    //if the bracket is in the middle of the statement
    //if the characters return any numbers?
    //if one statement is missing a bracket in the opening
    @Test
    public void missingBrackets () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(" "));
    }

    @Test
    public void bracketsBewtweenString () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsBeforeString () {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]launchcode"));
    }

    @Test
    public void















    //if one statement is missing a bracket in the closing
    //if the statement is missing brackets is returns true
    //if the statement has parenthesis ()
    //


}
