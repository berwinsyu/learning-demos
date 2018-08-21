package config.classloader;

import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassLoader {
    private URL url;
    private URLClassLoader classLoader;

    public CustomClassLoader(URL url){
        this.url = url;
        this.classLoader = new URLClassLoader(new URL[] {this.url}, null);
    }

    public Object getInstance(String className) throws Exception{
        Class customClass = this.classLoader.loadClass(className);
        return customClass.newInstance();
    }
}
