import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class PrintHellTest {
    Logger LOG = Logger.getLogger("PrintHell");

    @org.junit.Test
    public void getHell() {

        LOG.info("Info message");
        LOG.warn("Warn message!!!");
        LOG.error("Error message");

        PrintHell printHells = new PrintHell();
        String msg = printHells.getHell();
        String expected = "Hello Hell!!!";

        assertEquals(expected, msg);
    }

}