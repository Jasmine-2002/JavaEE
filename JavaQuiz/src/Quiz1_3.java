import java.util.Scanner;

public class Quiz1_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double answer1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double answer2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + answer1 + " and " + answer2);
        }
        else if (discriminant == 0){
            double answer1 = (-b + Math.pow(discriminant,0.5)) / (2 * a);
            System.out.println("The eqution has one root " + answer1);
        }
        else
            System.out.println("The eqution has no real roots");
    }
}


