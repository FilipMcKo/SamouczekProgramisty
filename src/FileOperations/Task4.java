package FileOperations;
import java.io.*;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = scanner.nextLine();
        DataInputStream inputStream = null;
       Integer number;


        try{
            inputStream = new DataInputStream(new FileInputStream(fileName));
            for(int i = 0; i<3; i++){
                System.out.println(inputStream.readInt());
            }
        }finally {
            if(inputStream!=null) inputStream.close();
        }
    }
}
