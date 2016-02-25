package p2;

/*
 * Created by emailman on 2/25/2016.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        System.out.println("Does it exist? " + file.exists());

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                try {
                    double grade = input.nextDouble();
                    System.out.println("grade = " + grade);
                } catch (Exception e) {
                    System.out.println("bad data");
                    input.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
