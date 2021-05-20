package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Farkas", "Istvan");
        Student student2 = new Student("Benedek", "Emese");
        // save the object to file
        try (ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("student.ser"))){
            out.writeObject(student1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // read the object from file
        try(ObjectInputStream in = new ObjectInputStream( new FileInputStream("student.ser"))){
            student1 = (Student) in.readObject();
            System.out.println(student1);
            System.out.println("Counter: " + Student.getCounter());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
