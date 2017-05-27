import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class MyTests {

    @Test
    public void firstTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void secondTest() {
        Assert.assertTrue(new Random().nextBoolean(), "secondTest - 50 %");
    }

    @Test
    public void thirdTest() {
        throw new RuntimeException(this.toString());
    }
}
