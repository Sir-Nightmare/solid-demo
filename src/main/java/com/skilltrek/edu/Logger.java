package com.skilltrek.edu;


/**
 * @author Eugene Krivosheyev on 18.09.14.
 *
 */
public class Logger {
    private Filter filter = new SeverityFilter();
    private Appender appender = new ConsoleAppender();

    public void log(String message, int level) {
        if(filter.filter(level)) {
            appender.append(message);
        }
    }

}
