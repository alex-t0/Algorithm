import net.alext.MegaClass;
import org.junit.Test;
import org.junit.Assert;

public class SimpleTest {
    @Test
    public void SimpleTest(){
        Assert.assertEquals(1 - 1 + 0, new MegaClass().ReturnZero());
    }
}
