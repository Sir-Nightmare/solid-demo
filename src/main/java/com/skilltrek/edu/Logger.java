package com.skilltrek.edu;


import java.io.IOException;

/**
 * @author Eugene Krivosheyev on 18.09.14.
 *
 */
public class Logger {
    private Filter filter = new SeverityFilter();
    private Appender appender = new ConsoleAppender();

    public void log(String message, int level) {
        //Responsibilites:
        appender.append(message);
        try {
            Object o = filter.filter();
        } catch (IOException e) {

        }
    }

}
