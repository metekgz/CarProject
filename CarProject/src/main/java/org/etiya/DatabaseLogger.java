package org.etiya;

public class DatabaseLogger implements BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("Database Logger " + message);
    }
}
