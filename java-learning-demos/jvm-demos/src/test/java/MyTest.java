import com.serotonin.modbus4j.Modbus;
import indi.berwin.demo.utils.DebugUtil;
import org.junit.Test;

import java.lang.reflect.Method;

public class MyTest {
    @Test
    public void testClassLoaderPath(){
        DebugUtil.wc("BCL:\n" + ClassLoaderObserver.getPathOfBCL());
        DebugUtil.wc("ECL:\n" + ClassLoaderObserver.getPathOfECL());
        DebugUtil.wc("SCL:\n" + ClassLoaderObserver.getPathOfSCL());

    }

    @Test
    public void testStopWatch() throws Exception{
        Modbus modbus = new Modbus();
        DebugUtil.wc(modbus.toString());

        Object stopWatch = StopWatchFactory.getStopWatch();

        for (Method m:stopWatch.getClass().getMethods()
             ) {
            DebugUtil.wc(m.getName());
        }
    }
}
