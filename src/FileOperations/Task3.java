package FileOperations;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of file: ");
        String fileName = scanner.nextLine();
        DataOutputStream outputStream = null;

        try {
            outputStream = new DataOutputStream(new FileOutputStream(fileName));
            System.out.println("Write your birthday");
            System.out.print("Day: ");
            outputStream.writeInt(scanner.nextInt());
            System.out.print("Month: ");
            outputStream.writeInt(scanner.nextInt());
            System.out.print("Year: ");
            outputStream.writeInt(scanner.nextInt());
        } finally {
            if (outputStream != null) outputStream.close();
        }
    }

}
