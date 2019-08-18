import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Administrator on 2019/8/11.
 */
public class Main {
    public static void main(String args[])
    {
        try {
            URL u = null;
            u = new URL("file:/d:/my/lib/");
            URLClassLoader ucl = new URLClassLoader(new URL[]{ u }) ;
            Class c = ucl.loadClass(args[0]) ;
            System.out.println("1111");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
