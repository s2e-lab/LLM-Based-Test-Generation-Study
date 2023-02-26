package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IscubeTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.Iscube.iscube(1));
		assertEquals(false, scenario2.Iscube.iscube(2));
		assertEquals(true, scenario2.Iscube.iscube(-1));
		assertEquals(true, scenario2.Iscube.iscube(64));
		assertEquals(false, scenario2.Iscube.iscube(180));
		assertEquals(true, scenario2.Iscube.iscube(1000));
		assertEquals(true, scenario2.Iscube.iscube(0));
		assertEquals(false, scenario2.Iscube.iscube(1729));
		
    }

}