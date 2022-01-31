//Hello World
import java.util.*;
public class FractionDemo
{
    public static void main(String[] args)
    {
        while(true)
        {
            Scanner kb = new Scanner(System.in);
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();

            System.out.println("Fraction 1 :");
            f1 = f1.read();
            System.out.println("Fraction 2 :");
            f2 = f2.read();

            Fraction sum = f1.add(f2);
            System.out.print(f1 + " + " + f2 + " = " + sum +" = ");
            sum.printFloat();
            Fraction difference = f1.subtract(f2);
            System.out.print(f1 + " - " + f2 + " = " + difference +" = ");
            difference.printFloat();
            Fraction product = f1.multiply(f2);
            System.out.print(f1 + " * " + f2 + " = " + product + " = ");
            product.printFloat();
            Fraction quotient = f1.divide(f2);
            System.out.print(f1 + " / " + f2 + " = " + quotient + " = ");
            quotient.printFloat();
            System.out.println("Do you want to continue ('Y' or 'y' for yes)?");
            String answer =  kb.nextLine();
            if(answer.equals("n") || answer.equals("N"))
                break; 

        }
        System.out.print(Fraction.numberOfFractions() + " fractions have been created.");
    }
}
