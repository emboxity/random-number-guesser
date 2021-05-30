import java.util.Scanner; 
import javax.swing.*;
public class guess {
public static void main(String [] args){

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter your number!");

    int computerAnswer = (int) Math.round(Math.random() * 100 + 1);
    int userAnswer = 0;
    

    int count = 1;

    while (userAnswer != computerAnswer){
        String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", 3);
        userAnswer = Integer.parseInt(response);
        JOptionPane.showMessageDialog(null, ""+ findGuess(userAnswer, computerAnswer, count));
        count++;

    }

    reader.close();
}
    public static String findGuess(int userAnswer, int computerAnswer, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        } else if (userAnswer == computerAnswer){
            return "You guessed it correctly!";
        } else if (userAnswer > computerAnswer){
            return "Your guess is too high!";
        } else if (userAnswer < computerAnswer){
            return "Your guess is too low!";
        }else {
            return "Incorrect!";
        }

}
}
