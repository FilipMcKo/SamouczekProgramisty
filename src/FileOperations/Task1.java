package FileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = scanner.nextLine();
        FileWriter fileWriter = null;
        String line;

        try {
            fileWriter = new FileWriter(fileName,true);
            while (true) {
                System.out.print("Pisz: ");
                line = scanner.nextLine();
                if (line.equals("-")) break;
                fileWriter.write(line);
                fileWriter.write(System.lineSeparator());
            }
        } finally {
            if (fileWriter != null) fileWriter.close();
        }
    }
}
