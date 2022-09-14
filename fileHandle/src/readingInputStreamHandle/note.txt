package readingInputStreamHandle;

import java.io.*;

public class ReadingInputStream {
    public static void main(String[] args) {
        File file = new File("src/readingInputStreamHandle/note.txt");
//        System.out.println(file.exists());

        StringBuilder sb = new StringBuilder();
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            int b;

            while ((b = in.read()) != -1) {
                sb.append((char)b);
            }
        }
        catch (IOException ioe) {
            System.out.println("Exception is caught" + ioe);
        }
        finally {
            try {
                in.close();
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        System.out.println(sb);
    }
}
