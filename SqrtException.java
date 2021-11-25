import java.util.Scanner;

public class SqrtException 
{ 
    //variable
    static int value; 

    //main method
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        //User input
         try 
        { 
            System.out.println("Enter a number to take the square root of: "); value = input.nextInt();
            //Squar root anything 0++
            if(value >= 0)
            {
                System.out.println(Math.sqrt(value));
            }
            //if the number was negative
            else
            {
                throw new ArithmeticException("\n\nCannot take the square root of a negative value");
            }
        } 
    catch (Exception e) 
    {
        System.out.println("Exception :"+e);
    }
    }
}

