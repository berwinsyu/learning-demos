import indi.berwin.demo.utils.DebugUtil;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamTester {
    OutputStream outputStream = null;
    InputStream inputStream = null;
    @Test
    public void test(){
//        DebugUtil.wc(CharactersGenerator.generatePrintableCharacterLines(new Object()););
    }

    @Test void  testIOFilterChain(){
        try {
            FileInputStream fileInputStream = new FileInputStream("./test");
            DebugUtil.wc("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
