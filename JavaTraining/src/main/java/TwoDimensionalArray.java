import java.io.*;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main (String [] args) throws FileNotFoundException {
    File inFile = new File ("data.txt");

    try{
        Scanner in = new Scanner(inFile);
        String line = in.next();
        System.out.println ("File found");
    }
    catch (IOException ex){
        System.out.println ("File not found");

    }
        FileReader fr = new FileReader("data.txt");
        try{
        BufferedReader text = new BufferedReader(fr);
        int numberOfLines =3;
        String [] textData = new String [numberOfLines];
           
        for (int i = 0; i<numberOfLines;i++ ) {
            textData[i] = text.readLine();
            System.out.println (textData[i]);
        }
//        }catch(FileSystemException ex){
//            System.out.println ("Not found");

        } catch (IOException e) {
        //    e.printStackTrace();
        }


    }
}
