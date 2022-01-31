// Hello World
import java.util.Scanner;
public class Fraction 
{
    private int numerator;
    private int denominator;
    private static int created = 0; 

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
        
    }
    public Fraction(int numINP,int denINP)
    {
        dataNorm(numINP,denINP);
    }
    private int gcd(int num1, int num2)
    {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num1 != num2)
        {
            if (num1 > num2)
                num1 = num1 - num2;
            
            else
                num2 = num2 - num1;  
            if (num1 == 0)
            {
                num1 = 1;
                break; }
        }
        return num1
    }

    private void dataNorm(int numINP, int denINP)
    {
        int gcdcalled = 0;
        if (numINP == 0 && denINP > 0)
        {
            numerator = 0;
            denominator = 1;
            
        }   
        else if (denINP==0)
        {
            System.out.println("Warning Denominator cannot equal 0");
            System.out.println("the fraction is set to 0/1");
            numerator = 0;
            denominator = 1;        
        }
        else if (denINP < 0) 
        {
            numerator = -numINP;
            denominator = -denINP; 
            gcdcalled = gcd(numINP, denINP);
            numerator /= gcdcalled;
            denominator /= gcdcalled; 
        }
        else
        { 
            numerator = numINP;
            denominator = denINP;
            gcdcalled = gcd(numINP, denINP);
            numerator /= gcdcalled;
            denominator /= gcdcalled; 
        }

        created ++;
    }
    public float printFloat()
    {
        float num = (float)numerator;
        float den = (float)denominator;
        float equat = num / den ; 
        System.out.print(equat+"\n");
        return equat;
    }
    public static int numberOfFractions()
    {
        return created;
    }
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    public Fraction add (Fraction equat)
    {
        int num1 = numerator * equat.denominator; 
        int denom = denominator * equat.denominator;
        int num2 = equat.numerator * denominator; 
        int sum = num1 + num2;
        return new Fraction(sum,denom);
    }
    public Fraction subtract (Fraction equat)
    {
        int num1 = numerator * equat.denominator; 
        int denom = denominator * equat.denominator;
        int num2 = equat.numerator * denominator; 
        int sum = num1 - num2;
        return new Fraction(sum, denom);
    }
    public Fraction multiply (Fraction equat)
    {
        int num1 = numerator * equat.numerator; 
        int denom = denominator * equat.denominator;
        return new Fraction(num1, denom);
    }
    public Fraction divide (Fraction equat)
    {
        int num1 = numerator * equat.denominator; 
        int denom = denominator * equat.numerator;
        return new Fraction(num1, denom);
    }
    public static Fraction read()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("enter an integer numerator: ");
        int num = kb.nextInt();
        System.out.print("enter an integer denominator: ");
        int den = kb.nextInt();
       // Fraction result = new Fraction(num,den);
        //return result;
        return new Fraction(num,den); 

    }
}
