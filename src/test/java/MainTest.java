import org.testng.Assert;
import org.testng.annotations.Test;
import school.RedrRover.Main;

public class MainTest {

@Test
    public void padTest() {

    Assert.assertEquals("llll", Main.padTest(4, "l"));
    Assert.assertEquals("2c2c2c2c", Main.padTest(4, "2c"));
    Assert.assertEquals("11111", Main.padTest(5, "1"));
    Assert.assertEquals("", Main.padTest(0, "lsf"));
    Assert.assertNotEquals("", Main.padTest(1, "lsf"));

    }
}
