import java.util.*;

public class SumofCubes{
    public static void main(String args[]){
        int userNumber;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userNumber = input.nextInt();

        int original = userNumber;

        do{
            int n = userNumber % 10;
            sum = sum + Math.pow(n,3);
            userNumber = userNumber / 10;
        }
        while (userNumber != 0);
        System.out.println("The sum of the cubes of " + original + " is " + sum);


    }
}