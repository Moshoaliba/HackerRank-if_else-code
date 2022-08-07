import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Getting user input
        System.out.println("Enter any number to test: ");
        int num = input.nextInt();

        if(num % 2 == 0){   //the number is even
            if(num > 2 && num < 5)  //the even number is between 2 and 5
            {
                System.out.println("Even and not weird");
            }
            else if(num > 6 && num < 20)    //the even number is between 6 and 20
            {
                System.out.println("Even and weird");
            }
            else    //default condition
            {
                System.out.println("Even and not weird");
            }
        }
        else    //the number is odd
        {
            System.out.println("Odd and weird");
        }
    }
}
