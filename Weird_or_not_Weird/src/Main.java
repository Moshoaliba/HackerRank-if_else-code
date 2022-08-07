import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number to test: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            if(num > 2 && num < 5)
            {
                System.out.println("Even and not weird");
            }
            else if(num > 6 && num < 20)
            {
                System.out.println("Even and weird");
            }
            else
            {
                System.out.println("Even and not weird");
            }
        }
        else
        {
            System.out.println("Odd and weird");
        }
    }
}
