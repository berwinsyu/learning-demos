import config.classloader.CustomClassLoader;
import indi.berwin.demo.utils.DebugUtil;
import org.apache.commons.lang3.time.StopWatch;

import java.net.URL;

public class StopWatchFactory {
    private static URL url;
    static {
        try {
            url = new URL("file:E:\\Windey_E\\berwinws\\learning-demos\\java-learning-demos\\jvm-demos\\lib\\commons-lang3-3.5.jar");
        }
        catch (Exception e){
            DebugUtil.wc(e.toString());
        }
    }
    public static StopWatch getStopWatch() throws Exception{
        CustomClassLoader customClassLoader = new CustomClassLoader(url);
        return (StopWatch)customClassLoader.getInstance("org.apache.commons.lang3.time.StopWatch");
    }
}