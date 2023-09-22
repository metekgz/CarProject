package org.etiya;

public class MailLogger implements BaseLogger {
    @Override
    public void Log(String message) {
        System.out.println("Mail Logger " + message);
    }
}
