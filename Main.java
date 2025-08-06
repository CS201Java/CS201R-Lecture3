import java.io.IOException;
import java.util.*;
import java.io.PrintWriter;
import java.io.File;
import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) throws IOException {

        //Basic String Methods
        String myMessage = "CS201 is Great!";

        int len    = myMessage.length( ); 
        System.out.println("Length: " + len);

        char char1 = myMessage.charAt(3);  			 
        System.out.println("Char1: " + char1);

        String newS1 = myMessage.concat("It is!");
        System.out.println("New String1: " + newS1);		 

        String newS2 = myMessage.toUpperCase(); 
        System.out.println("New String2: " + newS2);		 

        //Reading Strings from Console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");

        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
   

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        input.nextLine();
        System.out.print("Enter three words separated by spaces: ");   
        String s4 = input.nextLine();  

        System.out.println("s4 is " + s4);

        input.close();

        //Checking the String Pool
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println("str1 == str2:      " + (str1 == str2)); 
        System.out.println("str1 == str3:      " + (str1 == str3)); 
        System.out.println("str3 == str4:      " + (str3 == str4)); 
        System.out.println("str1.equals(str3): " + (str1.equals(str3))); 

        String s5 = new String ("This is It");
        String s6 = "This is It";
        String s7 = "THIS IS IT";
        System.out.println("str5 == str6:              " + (s5 == s6));
        System.out.println("str6.equalsIgnoreCase(s7): " + (s6.equalsIgnoreCase(s7)));


        //Substrings

        String str8 = "Welcome to Java";
        System.out.println(str8.substring(3));  
        System.out.println(str8.substring(4, 5));  
        System.out.println(str8.substring(4, 7));  


        //Reading & Writing to files

        //PrintWriter is a class to work with formatted output
        PrintWriter outFile = new PrintWriter("output.txt");

        //Set up the file & use Scanner to read from it
        File inFileName = new File("input.txt");
        Scanner inFile = new Scanner(inFileName);

        //read 5 input records and add the words to an arraylist
        ArrayList<String>words = new ArrayList<>();

        String str9;
        for (int i = 1; i <= 5; i++) {
            str9 = inFile.nextLine();
            if (!str9.isEmpty())
                words.add(str9.trim().toLowerCase());
            System.out.println(str9);
        }

        //print output to the outFile
        outFile.println("Hello! Here are your 5 words: ");
        for (String s:words)
            outFile.println(s);

        //close both files
        inFile.close();
        outFile.close();

        //A bit about Java Classes
        //create an object:
		
        Car newCar = new Car("Red","Mustang",1994);
    	newCar.startEngine();

    }
}