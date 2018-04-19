import org.testng.annotations.Test;
import ru.sbertech.Palindrome;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by davlet on 4/8/18.
 */
@Test
public class Test1 {

    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("assa"));
    }

    @Test
    public void whenNotPal() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("assad"));
    }
}
