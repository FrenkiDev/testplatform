import static org.junit.Assert.assertEquals;

public class PrintHellTest {
    @org.junit.Test
    public void getHell() {
        PrintHell printHells = new PrintHell();
        String msg = printHells.getHell();
        String expected = "Hello Hell!!!";

        assertEquals(expected, msg);
    }

}