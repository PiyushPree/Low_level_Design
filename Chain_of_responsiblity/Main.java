public class Main {
    public static void main(String[] args) {
        LogProcessor logobj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logobj.log(LogProcessor.ERROR," Error Exception happen");
        logobj.log(LogProcessor.DEBUG," need to Debug");
        logobj.log(LogProcessor.INFO," just for info");
    }
}
