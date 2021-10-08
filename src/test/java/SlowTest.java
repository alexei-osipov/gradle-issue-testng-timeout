import org.testng.annotations.Test;

public class SlowTest {
    @Test(timeOut = 10)
    public void testThatTimesOut() throws InterruptedException {
        Thread.sleep(1000);
    }
}
