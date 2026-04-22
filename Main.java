import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("\n\nDEMONSTRATION OF ORDER OF OPERATIONS");  
        System.out.println("true || false && false     =  " + (true || false && false));
        System.out.println("true && false || false     =  " + (true && false || false));
        System.out.println("4 + 3 > 2 && 4 - 2 > 5     =  " + (4 + 3 > 2 && 4 - 2 > 5));
        System.out.println("2 * 2 - 3 > 2 || 4 + 2 > 5 =  " + (2 * 2 - 3 > 2 || 4 + 2 > 5));

        int x = 0, y = 10, z = 10;
        System.out.println("1a)  x == 0 && x != 10     =  " + (x == 0 && x != 10 )); 
        x = 5;      
        System.out.println("1b)  x == 0 && x != 10     =  " + (x == 0 && x != 10 ));
        x = 0;
        System.out.println("2a)  x == 5 || y == 10 && z != 10     =  " + (x == 5 || y == 10 && z != 10 ));   
        x = 5;
        y = 0;
        z = 0;
        System.out.println("2b)  x == 5 || y == 10 && z != 10     =  " + (x == 5 || y == 10 && z != 10 )); 

        boolean a = true, b = false, c = false, d = false;
        System.out.println("3)  a && b == c && d      = " + (a && b == c && d));        
        System.out.println("vs  (a && b) == (c && d)  = " + ((a && b) == (c && d)));    
        
        System.out.println("\n\nDEMONSTRATION OF FLOATING POINT EQUALITY");
        final double EPSILON = 1E-14;
        double f = 5.4, g = 5.3;
        System.out.println("  f == g + .1  = " + (f == g + 0.1));           
        System.out.println("  f == g + .1  = " + (Math.abs(f - (g + 0.1)) < EPSILON));   
        
        double h = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(h == 0.5); 
        if (Math.abs(x - 0.5) < EPSILON)
            System.out.println(x + " is approximately 0.5");


         System.out.println("\n\nDEMONSTRATION OF VARIOUS STRING COMMANDS");  
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
        
        char1 = myMessage.charAt(7);
        char1 = Character.toUpperCase(char1);  			 
        System.out.println("Char1: " + char1);

        System.out.println("\n\nDEMONSTRATION OF SCANNER NEXT AND NEXTLINE");  
        //Reading Strings from Console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: ");

        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
   

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        input.nextLine();   //why is this here???
        System.out.print("Enter three words separated by spaces: ");   
        String s4 = input.nextLine();  
        System.out.println("s4 is " + s4);

        input.close();

        System.out.println("\n\nDEMONSTRATION OF STRING POOL");  
        //Checking the String Pool
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println("str1 == str2:      " + (str1 == str2)); 
        System.out.println("str1 == str3:      " + (str1 == str3)); 
        System.out.println("str3 == str4:      " + (str3 == str4)); 
        System.out.println("str1.equals(str3): " + (str1.equals(str3))); 
        System.out.println("Identity Hash Code: str1: " + System.identityHashCode(str1));
        System.out.println("Identity Hash Code: str2: " + System.identityHashCode(str2));   
        System.out.println("Identity Hash Code: str3: " + System.identityHashCode(str3));
        System.out.println("Identity Hash Code: str4: " + System.identityHashCode(str4));   

        String s5 = new String ("This is It");
        String s6 = "This is It";
        String s7 = "THIS IS IT";
        System.out.println("str5 == str6:              " + (s5 == s6));
        System.out.println("str6.equalsIgnoreCase(s7): " + (s6.equalsIgnoreCase(s7)));


        //Substrings
        System.out.println("\n\nDEMONSTRATION OF SUBSTRINGS"); 
        String str8 = "Welcome to Java";
        System.out.println("Identity Hash Code: str8: " + System.identityHashCode(str8));
        System.out.println(str8.substring(3));  
        System.out.println(str8.substring(4, 5));  
        System.out.println(str8.substring(4, 7));  
        System.out.println("Identity Hash Code: str8: " + System.identityHashCode(str8));

        System.out.println("\n\nDEMONSTRATION OF MUTABILITY?"); 
        str8 = str8.substring(3, 9);
        System.out.println(str8);  
        System.out.println("Identity Hash Code: str8: " + System.identityHashCode(str8));


        //Checking for Binary Values
        System.out.print("\n\nDEMONSTRATION OF VERIFYING INPUT (BINARY)"); 
        System.out.println(" & DEMONSTRATION OF AN ARRAYLIST OF STRINGS"); 
        ArrayList<String> binList = new ArrayList<>(Arrays.asList("0101", "abc", "000", "1111"));
        for (String bin: binList){
            if (!isBinary(bin))
                System.out.println(bin + " is not a binary value");
            else
                System.out.println(bin + " is a binary value");
        }


        //Reading & Writing to files
        System.out.println("\n\nDEMONSTRATION OF READING & WRITING TO FILES"); 

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

        System.out.println("\n\nDEMONSTRATION OF JAVA CLASS CAR"); 
        //A bit about Java Classes
        //create an object:
		
        Car newCar = new Car("Red","Mustang",1994);
    	newCar.startEngine();

    }

    //Validate that the string only contains 0s and 1s.  
    //PRE: accepts a string
    //POST: if string only contains 0s & 1s – return true; else return false
       
    public static boolean isBinary(String str){
        System.out.println("   ***isBinary needs to be written***");
        return false;
    }

}