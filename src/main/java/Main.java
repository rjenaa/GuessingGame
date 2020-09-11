/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        Random num = new Random();
        boolean access = false;
        int max = 100;
        int min = 0;
        int counter = 0;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> guess = new ArrayList<>();
        do{

            try{    
                System.out.println("Please guess the number. The max is " + max + " the min is " + min);
                int input = userInput.nextInt();

                if (input == (randomNum)) {
                    access = true;

                    System.out.println("Success, it took " + counter + " tries to find it!");
                }
                //counter++;
                if (input < randomNum) {
                    System.out.println("Too small");
                }
                if (input > randomNum) {
                    System.out.println("Too large");
                }
                if (guess.contains(input)){
                    counter--;
                }
                guess.add(input);
                counter++;
            }
            catch (Exception e){
                System.out.println("Please type in valid Input!");
                userInput.next();

            }
        }
        while(!access);


    }
}
