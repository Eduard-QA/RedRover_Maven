import org.testng.annotations.Test;
import school.RedrRover.Main;

public class MainTest {
@Test
    public void padTest() {
        System.out.println("llll".equals(Main.padTest(4, "l")));
        System.out.println("2c2c2c2c".equals(Main.padTest(4, "2c")));
        System.out.println("11111".equals(Main.padTest(5, "1")));
        System.out.println("".equals(Main.padTest(0, "lsf")));
        System.out.println(!"".equals(Main.padTest(1, "lsf")));
    }
}
