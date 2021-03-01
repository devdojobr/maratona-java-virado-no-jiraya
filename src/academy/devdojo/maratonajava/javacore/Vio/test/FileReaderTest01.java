package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char)i);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
