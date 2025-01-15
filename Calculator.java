// A java program to create a  simple calculator
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);

      int number1,number2;
      

      System.out.println("Choose the Operator '+,-,*,/' :");
      int operator =scanner.nextInt();

      System.out.println("Enter  the first Number :");
      number1 =scanner.nextInt();

      System.out.println("Enter  the Second Number :");
      number2 =scanner.nextInt();


      double result;

      switch (operator) {
        case '+':
        result=number1+number2;
        System.out.println("Result :"+result);
        break;

        case '-':
        result=number1-number2;
        System.out.println("Result :"+result);
        break;

        case '*':
        result=number1*number2;
        System.out.println("Result :"+result);
        break;

        case '/':
        if(number2 >=0){
          System.out.println(" Error cant divide by zero");
        }
        else{  result=number1/number2;
          System.out.println("Result :"+result); }
       
        break;

        

        default:
        System.out.println("Error Enter the correct operator");
            break;
      } 
      scanner.close();
    }

   
}
