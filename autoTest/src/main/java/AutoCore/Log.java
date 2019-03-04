package AutoCore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    private static Logger LOGGER = LogManager.getLogger(Log.class.getName());

    public static void error(String className, String methodName, String exception){
        LOGGER.info("---------------------------------------------------------------------");
        LOGGER.info("ClassName: "+className);
        LOGGER.info("MethodName: "+methodName);
        LOGGER.info("Exception: "+exception);
        LOGGER.info("---------------------------------------------------------------------");

    }

    public static void info(String message){
        LOGGER.info(message);
    }


}
