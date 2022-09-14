import java.io.File;

public class FlePractice01 {
    public static void main(String[] args) {
        /*
        * Work with existing file
        * File is a class that represent file/directory in the file system
        * File class can create a file or delete it
        * File class will have meta data about the file
        * Meta data is a data about data
        *
        * File file = ne File(file_path)
        */
        File myFile = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io/note.txt");
        File dir = new File("/Users/kaiiemsawat/Documents/Java/Practice/ioHandle/io");

        System.out.println("File exist : " + myFile.exists()); // <--- check file existing
        System.out.println("File name : " + myFile.getName());
        System.out.println("Absolute path : " + myFile.getAbsolutePath());
        System.out.println("Is file : " + myFile.isFile());
        System.out.println("Is directory : " + myFile.isDirectory());
        System.out.println("Is directory : " + dir.isDirectory());
        System.out.println("-----------");

        System.out.println("Size : " + myFile.length()); // <--- return number of char in type of long

        System.out.println("Last modified : " + myFile.lastModified()); // <--- return in epoch date
//        epoch date is number of seconds from Jan 1, 1970. Unix time stamp

    }
}
