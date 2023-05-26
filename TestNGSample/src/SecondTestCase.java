import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void search() {
        System.out.println("This is login test");
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 2)
    void add() {
        System.out.println("This is add test");
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("Closing browser");
    }
}
