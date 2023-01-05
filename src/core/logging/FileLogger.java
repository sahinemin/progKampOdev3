package core.logging;

public class FileLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("File a loglandı");
    }
}
