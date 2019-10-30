import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinsTest {

    @Test
    public void incrementAndGetOnceTest(){
        Bins testBin = new Bins(3,8);
            testBin.incrementBin(7);
            int actual = testBin.getBin(7);

            Assert.assertEquals(1, actual);
    }

    @Test
    public void incrementTwiceAndGetTest(){
        Bins testBin = new Bins(3,8);
        testBin.incrementBin(5);
        testBin.incrementBin(4);
        testBin.incrementBin(5);
        int actual = testBin.getBin(5);

        Assert.assertEquals(2, actual);
    }

    @Test
    public void incrementTwiceAndPrintTest() {
        Bins testBin = new Bins(3, 8);
        testBin.incrementBin(5);
        testBin.incrementBin(4);
        testBin.incrementBin(5);

        System.out.println(Arrays.toString(testBin.bin));
    }
}
