// Import Scanner and FileWriter
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * A program that will store information about your pets.
 * It will store every pets name and breed.
 * And, in the end the program will show you all the data of your pets.
 * 
 * @author     Baldovi, Kyle Alexander
 * @assignment ICS 111 Assignment 09
 * @date       3/27/23
 * @bugs       Short description of bugs in the program, if any.
 */

 public class BaldoviKyle09 {
    public static void main(String[] args) {
        // Declare variables
        String[] petsName;
        String[] petBreed;
        int arraySize = 0;
        
        try {
            File fileW = new File("C:\\Users\\nbair\\Desktop\\Dogs.txt");
            FileWriter dogsFW = new FileWriter(fileW, true);  
            dogsFW.write("test");
        } catch (java.io.FileNotFoundException fileNotFound) {
            System.out.println("\n\tError: \"File Dogs.txt\" not found ");
        } catch (java.io.IOException fileCantWrite) {
            System.out.println("\n\tError: unable to write to the file");
        }
        

        Scanner inputStr = new Scanner(System.in);
        Scanner inputNum = new Scanner(System.in);

        // Introduction
        System.out.println("Hello there! This is the \"Many pets?\" Program.");
        System.out.println("This program will allow you to put all your pets name and breed into this.");

        try {
            // Ask user how many entries they would like to store
            System.out.println("How many pets do you want to enter?");
            arraySize = inputNum.nextInt();
            petsName = new String[arraySize];
            petBreed = new String[arraySize];
            System.out.println(petBreed.length);

            // Ask user to store the entries
            System.out.println("Thank you! You can store " + arraySize + " entries into this pet program");
            for (var i = 0; i < arraySize; i++) {
                System.out.println("\nPlease enter your pets name:");
                petsName[i] = inputStr.nextLine();

                System.out.println("Please enter their breed:");
                petBreed[i] = inputStr.nextLine();
            }

            // Write out all the data that the user inputed
            for (var i = 0; i < arraySize; i++) {
                System.out.println(petsName[i] + " is a " + petBreed[i]);
            }
        }
        catch (java.util.InputMismatchException its10NotTen) {
            // If user puts "Ten" instead of 10
            System.out.println("Error: please use integers: ex. 1, 2, 3, and 4");
        }
    }
 }