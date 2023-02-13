
import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);
        int Computerchoice= rnd.nextInt(20);
        System.out.println("Computerchoice: " + Computerchoice);
        //Guess the number

        for(int i=1;i<=6;i++){
            System.out.println("Guess the number between 0 and 20");
            int userChoice=sc.nextInt();
            if(userChoice>Computerchoice){
                System.out.println("Your Guess is too high");

            }
            else if(userChoice<Computerchoice){
                System.out.println("Your Guess is too low");
            }else{
                System.out.println("Gotcha! You guessed it right!");
                break;
            }

        }
    }
}
