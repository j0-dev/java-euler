import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodTests
{

    @Test
    void isPalindrome()
    {
        boolean palindromeNumber = Problem004.isPalindrome(906609);
        assertTrue(true, String.valueOf(palindromeNumber));

        boolean notPalindromeNumber = Problem004.isPalindrome(906608);
        assertFalse(false, String.valueOf(notPalindromeNumber));
    }
}