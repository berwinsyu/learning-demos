import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DisposePatternDemo {
    public static void doSomethingUsingOutputStream(){
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("./test");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null){
                try {
                    outputStream.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void doSomethingUsingOutputStreamV2(){
        try (OutputStream outputStream = new FileOutputStream("./test"))
        {
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
