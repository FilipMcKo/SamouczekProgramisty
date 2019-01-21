package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void deserialize(String fileName) throws IOException, ClassNotFoundException {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))){
            List names = (List)inputStream.readObject();
            System.out.println(names);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String tmp;
        System.out.println("Enter '-' to stop: ");
        while(true){
            System.out.print("Enter name: ");
            tmp = scanner.nextLine();
            if(tmp.equals("-")) break;
            names.add(tmp);
        }

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("names.bin"))){
            outputStream.writeObject(names);
        }

        deserialize("names.bin");


    }
}
