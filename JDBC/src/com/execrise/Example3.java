package com.execrise;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class DemoLogger {
    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void makeSomeLog() {
        LOGGER.log(Level.WARNING, "My first Log Message");

    }
}

public class Example3 {

    public static void main(String[] args) {
        DemoLogger obj = new DemoLogger();
        obj.makeSomeLog();

        LogManager lgmngr = LogManager.getLogManager();

        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        log.log(Level.INFO, "This is a log message");

    }
}

