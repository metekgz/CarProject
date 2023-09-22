package org.etiya;

public class FileLogger implements BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("File Logger " + message);
    }
}
