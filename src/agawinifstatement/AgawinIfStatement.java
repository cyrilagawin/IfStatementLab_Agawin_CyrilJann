

package agawinifstatement;
import java.util.Scanner;

public class AgawinIfStatement {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter your age");
        int age = input.nextInt();
        
        System.out.println("Please enter today's temperature");
        int temp = input.nextInt();
        
        System.out.println("Please enter your test score");
        int score = input.nextInt();
        
        System.out.println("Enter the radius of a circle");
        double radius = input.nextDouble();
        
        System.out.println("Please enter a random number");
        int num= input.nextInt();
        
        // Task number 1
        if (age < 13)
        {
        System.out.println("you are a child");
        }
        else if ( age <= 19)
        {
        System.out.println("You are a teenager");
        }else 
        {
        System.out.println("You are an adult");
        }
        if (temp < 0)
            
        //Task number 2    
        {
        System.out.println("Freezing point");
        }
        else if (temp <= 25)
        {
        System.out.println("Normal Weather");
        }
        else
        {
        System.out.println("Hot Weather");    
        }
        
        //Task number 3
        if (score >= 90 && score >100)
        {
        System.out.println("Excellent");
        }
        else if  (score >= 75 && score <= 89)
        {
        System.out.println("Good");    
        }
        else 
        {
         System.out.println("Needs Improvement");    
        }
        
        //Task number 4
        if (radius <= 0)
        {
         System.out.println("Invalid");    
        }
        else 
        {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI;
        System.out.println("Area:" + area); 
        System.out.println("circumference:" + circumference);
        }
        
        //Task number 5
        
        if (num % 2 == 0)
        {
        System.out.println(" Even Number");   
        }
        else 
        {
        System.out.println(" Odd Number ");     
        }
    }
    
    
}
