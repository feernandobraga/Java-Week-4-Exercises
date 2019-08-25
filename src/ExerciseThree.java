import java.util.Scanner;
public class ExerciseThree {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] songs = new String[3];
        String[] artists = new String[3];

        for (int i = 0; i < songs.length; i++) {
            System.out.println("\nPlease enter a favorite song:");
            songs[i] = userInput.nextLine();
            System.out.println("\nNow enter your favorite artist:");
            artists[i] = userInput.nextLine();
        }

        for (int i = 0; i < songs.length; i++) {
            for (int j = 0; j < songs.length -1; j++) {

                // the compareTo method returns: 0 if strings are equals
                // a positive number if the first string is greater than the second one
                // a negative number if the first string is lesser than the second one
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {

                    String songTemp = songs[j];
                    String artistTemp = artists[j];

                    songs[j] = songs[j + 1];
                    artists[j] = artists[j +1];

                    songs[j + 1] = songTemp;
                    artists[j + 1] = artistTemp;
                }
            }
        }

        System.out.println("\nYour favorite songs are:");
        for (int i = 0; i < songs.length; i++) {
            System.out.print(songs[i] + ", ");
        }

        System.out.println("\nYour favorite artists are:");
        for (int i = 0; i < artists.length; i++) {
            System.out.print(artists[i] + ", ");
        }

    }

}