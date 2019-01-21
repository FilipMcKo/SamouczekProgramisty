package Serialization.Task2;

import java.io.*;
import java.util.Calendar;

public class Human implements Serializable {
    private String name;
    private transient int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human person = new Human("Filip", 27);
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("properYear.bin"))){
            outputStream.writeObject(person);
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("properYear.bin"))){
            Human person1= (Human) inputStream.readObject();
            System.out.println(person1.name);
            System.out.println(person1.age);
        }

    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        stream.defaultReadObject(); //to musi byc wywolane przed readInt ale nie do konca jestem swiadomy dlaczego
        age = thisYear-stream.readInt();
    }

    private void writeObject(ObjectOutputStream stream) throws IOException{
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        stream.defaultWriteObject();  //to musi byc wywolane przed writeInt ale nie do konca jestem swiadomy dlaczego
        stream.writeInt(thisYear-age);
    }

}
