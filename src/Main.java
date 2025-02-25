// MASUNDA_TJ_223003954_CSC02A2_2025_P01
import acsse.csc2a.MorseCodeConverter; 
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Declaring empty strings is a safe option
        String message = "";
        String result = "";
        String encode = "";
        MorseCodeConverter objConverter = new MorseCodeConverter();
        Scanner objScanner = new Scanner(System.in);
        char option;

        System.out.print("Would you like to encode a message (Y) or decode (N?)");
        option = objScanner.next().charAt(0); // Geting input from the use
        // Whether they input yes or no, the first letter will be considered

        // This is to eat up the newline character which is called the buffer
        objScanner.nextLine();
        
        if(option == 'Y' || option == 'y')// If yes was the option, the message will be encoded
        {
            System.out.print("Please enter message to encode: ");
            message = objScanner.nextLine(); // Geting input
            result = objConverter.encode(message); // Encoding the message
            System.out.println("Encoded Message:\n_________________________\n" + result + "\n_________________________"); // Displaying the results
        }
        else if(option == 'N' || option == 'n') // If no was the answer, the morse code will be decoded
        {
            System.out.print("Please enter message to decode (use spaces in between Morse Code Letters):");
            message = objScanner.nextLine(); // Input morse code
            result = objConverter.decode(message); // Decoding the morse code
            System.out.println("Decoded Message:\n_________________________\n" + result + "\n_________________________"); // Displaying the results
        }
        else
        {
            System.out.println("Invalid option. Please enter 'Y' or 'N'."); // Invalid option response
        }

        objScanner.close(); // alsways close the scanner object
    }
} 

/*
 "if it is not right do not do it; if it is not true do not say it."
 Marcus Aurelius
 */
