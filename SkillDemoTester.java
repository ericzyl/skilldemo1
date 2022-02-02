import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void testAdd(){
        assertEquals(2, SkillDemo.add(1, 1));
    }
}
