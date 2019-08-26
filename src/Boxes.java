import java.util.Scanner;
public class Boxes {

    private int boxSize;

    // method to set the instance variable boxSize to the given value
    public void setSize(int sizeGiven){
        boxSize = sizeGiven;
    }

    // constructor that is called when a object is created
    // it gives a size to a box
    public Boxes(int boxSize){
        setSize(boxSize);
    }

    // method that tell the converts the box's size to String and prints it to the user
    public String toString(){
        String myString = "The box size is: " + String.valueOf(boxSize);

        return myString;
    }

    // method to draw the box
    // first it draws the top, then the body and the the bottom
    public void draw(){
        System.out.println();
        drawTopBottom();
        drawSides();
        drawTopBottom();
    }

    // this method draws the top and the bottom part of the box
    public void drawTopBottom(){
        System.out.print(" ");
        for (int i = 0; i < boxSize; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    // this method draws the body of the box
    public void drawSides(){
        for (int i = 0; i < boxSize; i++) {
            System.out.print("|");
            for (int j = 0; j < boxSize ; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int boxSize = 0;
        Scanner userInput = new Scanner(System.in);

        // repeat until the user enter a valid integer between 1 and 10
        while (boxSize < 1 || boxSize > 10) {
            System.out.println("Please enter a box size between 1 and 10 and press enter");
            boxSize = userInput.nextInt();
        }

        //creates a new box called myBox
        Boxes myBox = new Boxes(boxSize);

        //prints out the box's size using the method toString()
        System.out.println(myBox.toString());

        //it draws the box according to its size
        myBox.draw();

    }
}
