import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PrintHell {
    Logger LOG_Trace = LogManager.getLogger("PrintHell");
    Logger LOG = LogManager.getLogger(PrintHell.class);

    public String getHell(){
        LOG.info("PrintHell LOG Info message");
        LOG_Trace.warn("LOG_Trace Warn message!!!");
        LOG.error("PrintHell LOG Error message");

        return "Hello Hell!!!";
    }
    
}
