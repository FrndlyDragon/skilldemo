import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void helloTest(){
        assertEquals("hello", SkillDemo.hello());
    }
}
