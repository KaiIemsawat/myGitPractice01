import java.io.File;
import java.io.IOException;

public class FilePractice02 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/test.txt");
        if (file.exists()) {
            System.out.println("Yes, it is exist");
            System.out.println("We will delete it");
            file.delete();
        }
        else {
            System.out.println("No, the file is not there");
            System.out.println("We will create one");
            file.createNewFile();
        }

        //-----------------------------------

//        TODO -
//         create directory called sdet,
//         then create files -> oop.pdf, slide.pdf, cat.png, test_cases.xlsx, ccfa.txt

        File sdetDir = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/sdet");
        if (!sdetDir.exists()) {
            sdetDir.mkdir(); // <--- make directory
        }
        String dirPath = sdetDir.getAbsolutePath();

        File file01 = new File(dirPath + "/oop.pdf");
        file01.createNewFile();

        File file02 = new File(dirPath + "/slide.pdf");
        file02.createNewFile();

        File file03 = new File(dirPath + "/cat.png");
        file03.createNewFile();

        File file04 = new File(dirPath + "/test_cases.xlsx");
        file04.createNewFile();

        File file05 = new File(dirPath + "/ccfa.txt");
        file05.createNewFile();
    }
}
