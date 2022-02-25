import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("Guess a number between 1-100");
        if (input < number) {
            System.out.println("Guess too low!");
        }
        if (input == number) {
            System.out.println();
        }
        if (input > number) {
            System.out.println("Guess too high");
        }
    }
}
