import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = (int)(Math.random()*100 + 1);
        System.out.println("Guess a number between 1 and 100");
        int guess = ' ';
        while (guess != number) {
            guess = scan.nextInt();
            if (guess < number) {
                System.out.println("Too low. Try again");
            } else if (guess > number) {
                System.out.println("Too high. Try again");
            } else if (guess == number) {
                System.out.println("Ding ding ding. Congratulations");
                break;
            }
            }
        }
        
    }

