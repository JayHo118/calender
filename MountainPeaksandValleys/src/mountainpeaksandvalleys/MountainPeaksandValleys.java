/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainpeaksandvalleys;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 000325920
 */
public class MountainPeaksandValleys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String fileName = "ex1_1.txt";
        File file = new File(fileName);

        //Excpetion handling if file is not found.
        try {
            Scanner fileInput = new Scanner(file);

            int[] numbers = new int[100];
            int count = 0;

            //Keep reading file as long as there are numbers in the file.
            while (fileInput.hasNextInt() != false && count < numbers.length) {
                numbers[count] = fileInput.nextInt();
                count++;
            }

            numbers = Arrays.copyOf(numbers, count);   //Trims array to 14 elements
            System.out.println("DATA in file:");
            System.out.println(Arrays.toString(numbers));   //Prints numbers to screen.

        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }

    }

}
