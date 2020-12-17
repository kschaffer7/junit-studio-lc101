package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    // Test 1 "[]", Is a balanced bracket and should assertTrue.
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    // Test 2 "", Does not contain brackets and should assertTrue.
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    // Test 3 "[LaunchCode]", Is a balanced bracket and should assertTrue.
    @Test
    public void testThree() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    // Test 4 "Launch[Code]", Is a balanced bracket and should assertTrue.
    @Test
    public void testFour() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    // Test 5 "[]LaunchCode", Is a balanced bracket and should assertTrue.
    @Test
    public void testFive() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    // Test 6 "[LaunchCode", Is not a balanced bracket and should assertFalse.
    @Test
    public void testSix() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    // Test 7 "Launch]Code[", Is not a balanced bracket and should assertFalse.
    @Test
    public void testSeven() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    // Test 8 "[", Is not a balanced bracket and should assertFalse.
    @Test
    public void testEight() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    // Test 9 "][" Is not a balanced bracket and should assertFalse.
    @Test
    public void testNine() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    // Test 10 "()" Does not contain brackets and should assertTrue.
    @Test
    public void testTen() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }
    // Test 11 "{}" Does not contain brackets and should assertTrue.
    @Test
    public void testEleven() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{}"));
    }
    // Test 12 "LaunchCode" Does not contain brackets and should assertTrue.
    @Test
    public void testTwelve() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

}
