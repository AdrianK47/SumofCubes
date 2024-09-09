import java.util.*;

public class SumofCubes{
    public static void main(String args[]){
        int userNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userNumber = input.nextInt();

        String userString = String.valueOf(userNumber);
        int size = userString.length();

        for(int i = 0; i < size; i++){
            int sum = (((userNumber / 10) / 10) / 10);
            System.out.println(sum);
        }

    }
}