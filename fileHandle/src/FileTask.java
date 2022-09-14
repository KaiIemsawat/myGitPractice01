import java.io.File;
import java.io.IOException;

public class FileTask {
    public static void main(String[] args) throws IOException {
        File rootSdet = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/sdet");

        File srcDir = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/sdet/src");
        srcDir.mkdir();
        File targetDir = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/sdet/target");
        targetDir.mkdir();

        String srcRoot = srcDir.getAbsolutePath();
        String targetRoot = targetDir.getAbsolutePath();

        File hello = new File(srcRoot + "/hello.txt");
        hello.createNewFile();
        File oop = new File(srcRoot + "/oop.txt");
        oop.createNewFile();

        File test = new File(targetRoot + "/test.xlsx");
        test.createNewFile();

        File pom = new File(rootSdet + "/pom.xml");
        pom.createNewFile();
    }
}
