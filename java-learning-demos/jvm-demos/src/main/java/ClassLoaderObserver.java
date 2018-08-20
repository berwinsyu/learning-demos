import org.apache.commons.lang3.time.StopWatch;

public class ClassLoaderObserver {

    public static String getPathOfBCL(){
        return System.getProperty("sun.boot.class.path");
    }

    public static String getPathOfECL(){
        return System.getProperty("java.ext.dirs");
    }

    public static String getPathOfSCL(){
        return System.getProperty("java.class.path");
    }

}
