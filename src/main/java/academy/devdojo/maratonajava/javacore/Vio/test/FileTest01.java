package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Created "+isCreated);
            System.out.println("path "+file.getPath());
            System.out.println("path absolute "+file.getAbsolutePath());
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("is hidden "+file.isHidden());
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
