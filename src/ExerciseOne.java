//why is it not working?

import java.util.Scanner;
public class ExerciseOne {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] songs = new String[10];
        String[] artists = new String[10];

        for (int i = 0; i < songs.length; i++) {
            System.out.println("\nPlease enter a favorite song:");
            songs[i] = userInput.nextLine();
            System.out.println("\nNow enter your favorite artist:");
            artists[i] = userInput.nextLine();
        }

        System.out.println("\nYour favorite songs are:");
        for (int i = 0; i < songs.length; i++) {
            System.out.print(songs[0] + ", ");
        }

        System.out.println("\nYour favorite artits are:");
        for (int i = 0; i < artists.length; i++) {
            System.out.print(artists[0] + ", ");
        }

    }

}
