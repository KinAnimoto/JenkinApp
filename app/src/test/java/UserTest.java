import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kin on 6/3/16.
 */
public class UserTest {
    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }

    @Test
    public void failingTest() {
        Assert.assertFalse(true);
    }
}
