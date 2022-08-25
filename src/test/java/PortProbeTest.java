import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PortProbeTest {
    // static {
    //     ch.qos.logback.classic.Logger root = (Logger) LoggerFactory.getLogger("ROOT");
    //     root.setLevel(Level.INFO);
    // }

    @Test
    public void probe1() {
        runChromes();
    }

    @Test
    public void probe2() {
        runChromes();
    }

    @Test
    public void probe3() {
        runChromes();
    }

    @Test
    public void probe4() {
        runChromes();
    }

    @Test
    public void probe5() {
        runChromes();
    }

    private void runChromes() {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        for (int i = 0; i < 50; i++) {
            ChromeDriver d = new ChromeDriver(options);
            d.close();
        }
    }

}
