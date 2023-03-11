package FilesPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;


public class FileTest {

    public interface MyInterface {
        default void getStr() {
            System.out.println("Hello");
        }
    }

    public static abstract class AbstractMy {
        public void qwer() {
            System.out.println("MAZAFAKA");
        }
        public abstract void ty();
    }
    public static class My extends AbstractMy implements MyInterface {
        public My () {
            super();
        }

        @Override
        public void ty() {
            System.out.println("HEHEHHEHE");
        }
    }


    public static void main(String[] args) throws IOException {
        File folder = new File("/Users/aksam/Documents");

        My my = new My();
        my.getStr();
        my.qwer();
        my.ty();


//        System.out.println(folder.createNewFile());
//        for (File x : folder.listFiles()) {
//            System.out.println(x.getAbsolutePath());
//            System.out.println(x.getName());
//            System.out.println(x.isDirectory());
//        }
    }
}
