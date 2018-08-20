import indi.berwin.demo.utils.DebugUtil;
import org.junit.Test;

import java.lang.reflect.Method;

public class LoadingTesterWithNoStopWatchClass {

    @Test
    public void testStopWatch() throws Exception{
//        Modbus modbus = new Modbus();
//        DebugUtil.wc(modbus.toString());

        Object stopWatch = StopWatchFactory.getStopWatch();
        boolean stopWatchIsStarted;

        for (Method m:stopWatch.getClass().getMethods()
                ) {
            DebugUtil.wc(m.getName());
        }
    }
}
