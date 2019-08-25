import java.util.Scanner;
public class ExerciseTwo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String sentence;

        System.out.println("Please enter a sentence and press enter:");
        sentence = userInput.nextLine();

        // the split() methods breaks the String
        String[] strReversed = sentence.split("");

        // this reversed loop interacts through the array starting at the end
        for (int i = strReversed.length -1; i >= 0 ; i--) {
            System.out.print(strReversed[i]);
        }

    }
}
