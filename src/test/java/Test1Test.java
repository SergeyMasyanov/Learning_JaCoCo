import org.testng.annotations.Test;
import ru.sbertech.utils.Palindrome;
import ru.sbertech.utils.StringUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by davlet on 4/8/18.
 */
@Test
public class Test1Test {

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

    @Test
    public void firstLetterTest(){
        String s = "String";
        StringUtils stringUtils = new StringUtils();
        assertEquals(stringUtils.getFirstLetter(s), 'S');
    }

    @Test
    public void lastLetterTest(){
        String s = "String";
        StringUtils stringUtils = new StringUtils();
        assertEquals(stringUtils.getLastLetter(s), 'g');
    }
}
