import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File myFile= new File("intro.txt");
            boolean fileCreated= myFile.createNewFile();
            if(fileCreated){
                System.out.println("File created successfully with name "+myFile.getName());
            }else{
                System.out.println("File already exist");
            }
            FileWriter writer= new FileWriter(myFile,true);
            writer.write("hey this is line 1 \n");
            writer.write("this is line 2 \n");
            writer.close();
            // Scanner reader= new Scanner(myFile);
            // while (reader.hasNextLine()) {
            //     System.out.println(reader.nextLine());
            // }
            // reader.close();
            BufferedReader reader= new BufferedReader(new FileReader(myFile));
            String str= reader.readLine();
            while (str!=null) {
                System.out.println(str);
                str=reader.readLine();
            }
            reader.close();
            // System.out.println(myFile.delete());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
