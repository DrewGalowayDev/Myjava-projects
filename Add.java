import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b,sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number :");
         a =scanner.nextInt();

         System.out.println("Enter the second number :");
         b = scanner.nextInt();

         //System.out.println(" The  sum of the numbers is :");
         sum =a+b;
         System.out.println("The sum is :"+sum);

         scanner.close();
    }



}