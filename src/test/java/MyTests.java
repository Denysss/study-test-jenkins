import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class MyTests {

    private String env = System.getProperty("env");

    @Test
    public void firstTest() {
        Assert.assertEquals(true, true);
    }

    @Test
    public void secondTest() {
        if ("QA".equals(env)) {
            Assert.assertTrue(new Random().nextBoolean(), "secondTest - random result for QA env.");
        }

        Assert.assertEquals(true, true);
    }

    @Test
    public void thirdTest() {
        Assert.assertTrue("STB".equals(env) || "QA".equals(env),
                String.format("thirdTest - ENV should be defined, 'QA' or 'STB'.\nActual ENV is '%s'.\n", env));
    }
}
