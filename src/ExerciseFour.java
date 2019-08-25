import java.util.Scanner;
public class ExerciseFour {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String message;
        StringBuffer finalMessage = new StringBuffer();
        String[][] decryptKey = {
                {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" }, // decryptKey[0][]
                {"c","r","g","z","a","v","i","b","s","d","o","e","q","f","h","u","j","x","k","l","w","m","y","n","p","t" } // decryptKey[1][]
        };

        System.out.println("Enter the message to be decoded and press enter");
        message = userInput.nextLine();
        message = message.toLowerCase();

        //the first thin is to break the message into an array
        String[] messageArray = message.split("");

        // now scan the input message with a foreach loop
        for (String s : messageArray) {

            // for each letter in the message find it on decryptkey[0][x]
            // if there's a match, append the decryptkey [1][x] to a string buffer
            for (int j = 0; j < decryptKey[0].length; j++) {
                if (s.equals(decryptKey[0][j])) {
                    finalMessage.append(decryptKey[1][j]);
                }
            }
            //if the letter in the character is an empty space, append a space to the string buffer
            if (s.equals(" ")) {
                finalMessage.append(" ");
            }

        }

        System.out.println("The final message is: " + finalMessage.toString());

    }

}
