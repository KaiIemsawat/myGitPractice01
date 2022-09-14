import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class testTheTesting {
    public static void main(String[] args) {
    }
    @Test
    public void checkFileExisting() {
        File file = new File("/Users/kaiiemsawat/Documents/Java/Practice/fileHandle/fileHandle/src/readingInputStreamHandle/note.txt");
        Assert.assertEquals(file.exists(), true);
    }

}
