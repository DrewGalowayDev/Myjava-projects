
//Write a Java program that input the radius of a sphere and calculate the volume. Where volume = 4/3Πr3.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
          
        double volume;
        double r;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle :");

         r = scanner.nextInt();

        volume =4/3*3.14*r*r*r;

        System.out.println("volume is "+volume);
         
        scanner.close();
    }
    

  
}
