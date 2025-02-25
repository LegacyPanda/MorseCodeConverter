// MASUNDA_TJ_223003954_CSC02A2_2025_P01
package acsse.csc2a;

// This is the MorseCodeConverter class
public class MorseCodeConverter
{
    public static String hello()
    {
        return "Hello world";
    }

    public String bye()
    {
        return "Bye Fallicia";
    }

    // Private member variables
    private String message;
    private String morseCode;

    // Private member arrays
    private String[] text = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                             "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Y", "W", "Z",
                             "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

    private String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                              ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                              "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                              "..---", "...--", "....-", ".....", "-....", "--...", "---..",
                              "----.", "-----",};

    // Private method
    private String ToUpper(String msg)
    {
        return msg.toUpperCase();
    }

    // Constructor
    public MorseCodeConverter()
    {
        this.message = "";
        this.morseCode = "";
    }

    // Message getter
    public String getMessage()
    {
        return message;
    }

    // MorseCode getter
    public String getMorseCode()
    {
        return morseCode;
    }

    // Message setters
    public void setMessage(String msg)
    {
        this.message = msg;
    }

    // Morse code setter
    public void setMorseCode(String morseCode)
    {
        this.morseCode = morseCode;
    }

    // Public function to encode the message into morse code
    public String encode(String msg)
    {
        message = ToUpper(msg);
        for(int i = 0; i < message.length(); i++)
        {
            int index = -1;
            char temp = message.charAt(i);

            for(int j = 0; j < 36; j++)
            {
                if(text[j].charAt(0) == temp) // charAt is used on strings
                {
                    index = j;
                }
            }
            if(index != -1)
            {
                morseCode += morse[index] + " ";
            }
        }

        return morseCode;
    }

    // Public function to decode the morse code into a readible message
    public String decode(String mc)
    {
        morseCode = mc;

        String[] tokens = morseCode.split(" ");
        
        for(String str : tokens)
        {
            int index = -1;
            for(int i = 0; i < 36; i++)
            {
                if(str.equals(morse[i]))
                {
                    index = i;
                    break; // End loop if found
                }
            }
            if(index != -1)
            {
                message += text[index];
            }
        }

        return message;
    }
}