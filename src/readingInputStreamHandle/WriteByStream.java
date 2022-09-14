package readingInputStreamHandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteByStream {
    public static void main(String[] args) throws IOException {
        File file = new File("src/readingInputStreamHandle/test.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        try(OutputStream out = new FileOutputStream(file)) {
            out.write(72);
            out.write(73);
            out.write(4);
            out.write(24);
            out.write(24);
            out.write(123);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
