package IntList;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetToZeroIfMaxFELTest {

    @Test
    public void testZeroOutFELMaxes1() {
        IntList L = IntList.of(1, 22, 15);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 15", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes2() {
        IntList L = IntList.of(55, 22, 45, 44, 5);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 22 -> 45 -> 0 -> 0", L.toString());
    }

    @Test
    public void testZeroOutFELMaxes3() {
        IntList L = IntList.of(5, 535, 35, 11, 10, 0);
        IntListExercises.setToZeroIfMaxFEL(L);
        assertEquals("0 -> 0 -> 35 -> 0 -> 10 -> 0", L.toString());
    }

    @Test
    public void testFELDigit1() {
        int a = 10;
        boolean actual = IntListExercises.firstDigitEqualsLastDigit(a);
        assertFalse(actual);
    }
    @Test
    public void testFELDigit2() {
        int a = 23;
        boolean actual = IntListExercises.firstDigitEqualsLastDigit(a);
        assertFalse(actual);
    }
    @Test
    public void testFELDigit3() {
        int a = 44;
        boolean actual = IntListExercises.firstDigitEqualsLastDigit(a);
        assertTrue(actual);
    }


}
