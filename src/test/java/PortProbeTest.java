import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PortProbeTest {

    @Test
    public void probe() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        int i = 0;
        try {

            for (i = 0; i < 1000; i++) {
                ChromeDriver d = new ChromeDriver(options);
                Object value = d.executeScript("return 'foo'");
                d.quit();
                Assert.assertEquals("foo", value);
            }
        } finally {
            System.err.println("Was able to created " + i + " instances");
        }
    }

}
