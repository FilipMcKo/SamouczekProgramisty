package FileOperations;
import java.io.*;
import java.util.Scanner;
public class Task2 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = scanner.nextLine();
        BufferedReader fileReader = null;
        String line;
        int nrOfLines = 0;
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine())!=null) {
                System.out.println(line);
                nrOfLines++;
            }
            System.out.print("Number of lines: " + nrOfLines);
        } finally {
            if (fileReader != null) fileReader.close();
        }
    }
}
