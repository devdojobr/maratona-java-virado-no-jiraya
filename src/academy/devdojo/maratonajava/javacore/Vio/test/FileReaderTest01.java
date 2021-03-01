package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
//            char[] in = new char[1000];
//            int size = fr.read(in);
//            System.out.println(size);
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
