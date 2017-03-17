
package Manipulations;
import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
 
          System.out.println("Enter Your Age");
 
          int age = sc.nextInt();         //Taking input from user
 
          try
          {
              if(age < 0)
              {
                  throw new AgeIsNegativeException("Age can not be negative");                 }
          }
          catch(AgeIsNegativeException ex)
          {
              System.out.println(ex);   
          }
    }
}
class AgeIsNegativeException extends Exception
{
    String errorMessage;
 
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString()
    {
        return errorMessage;
    }
}
