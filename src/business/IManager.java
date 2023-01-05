package business;
import core.logging.ILogger;


public abstract class IManager {
    public IManager(ILogger logger) {
        this.logger = logger;
    }


    private ILogger logger;

}
