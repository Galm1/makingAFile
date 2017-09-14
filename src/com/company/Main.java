package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void writeObject(School school) {
        try {
            File file = new File("School.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(school.getName() + "\n");
            fileWriter.write(school.getStudents() + "\n");
            fileWriter.close();
        } catch (IOException ex) { //A general exception that covers many errors
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        School mySchool = new School("tiy", 3);
        writeObject(mySchool);

    }
}
