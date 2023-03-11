package Logging;

import java.util.Objects;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
    private static final Logger LOGGER = Logger.getLogger(LoggerDemo.class.getName());


    public static void logging() {
        final Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.log(Level.WARNING, "Произошла ошибка");
        LOGGER.log(Level.INFO, "Все хорошо");
    }


    public static void main(String[] args) {

        System.out.println(LoggerDemo.class.getName());
        LOGGER.log(Level.INFO, "Logging...");

        LOGGER.log(Level.INFO, "Current value is x is {0} {1}", new Object[]{2, 3});
//        LOGGER.addHandler();
    }
}
