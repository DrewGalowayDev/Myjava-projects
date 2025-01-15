import java.util.Scanner;

public class CalculateCylinder {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);

        int height,radius;
        double Volume;
        

        System.out.println("Enter the height of the cylinder :");
        height =scanner.nextInt();

        System.out.println("Enter the radius of the cylinder :");
        radius  =scanner.nextInt();


        Volume =(2*3.142*radius*radius*height);
        System.out.println("The volume of the cylinder is : "+Volume);

        


          scanner.close();

    }
    
}
