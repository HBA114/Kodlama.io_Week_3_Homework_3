package kodlama_io.core.logging;

public class FileLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Logged To File : " + message);
    }
    
}
