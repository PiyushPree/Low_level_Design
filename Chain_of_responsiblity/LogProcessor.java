public class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nexLoggerProcesser;
    LogProcessor(LogProcessor loggerProcesser){
        this.nexLoggerProcesser = loggerProcesser;
    }
    public void log(int logLevel,String message){
        if(nexLoggerProcesser != null){
            nexLoggerProcesser.log(logLevel,message);
        }
    }
    
}