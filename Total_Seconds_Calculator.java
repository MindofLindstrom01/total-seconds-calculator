
  /*///////////////////////////////////////////////////////////////////////////////////////
 /                                                                                      
 /  Created By: Austin Lindstrom  Date Created: 9/6/2019
 /                                       
 /                        Program : PP2_8.java
 /
 /  This program will calculate the total number of seconds
 /  after provided the hours, minutes, seconds, and days,
 /  proceedingly will also display the total number of days 
 /  based on the total number of seconds.
 /
 *//////////////////////////////////////////////////////////////////////////////////////






import java.util.Scanner;                    //imports the scanner so we can use it
import java.text.DecimalFormat;        //allows us to format two decimal places
  



public class PP2_8 { //class file
  
  public static void main (String args[]) { //main method
    
    Scanner input = new Scanner(System.in);  //creates a new scanner object
    
    float total_days;      //float variable
    int days, hours, minutes, seconds, total_seconds; //integer variables
    final int SIXTY_SECONDS=60, SIXTY_MINUTES=60, TWO_FOUR_HOURS=24; //Constant Variables
    
    
    System.out.println("Please provide the number of days");  //print statement to 
      days = input.nextInt(); //scans for the input of # of days
    
    System.out.println("Please provide the number of hours");
      hours = input.nextInt();  //scans for the input of # of hours
    
    System.out.println("Please provide the number of minutes");
      minutes = input.nextInt(); //scans for the input of # of minutes
    
    System.out.println("Please provide the number of seconds");
      seconds = input.nextInt(); //scans for the input of # of seconds
    
    total_seconds = minutes*SIXTY_SECONDS+hours*SIXTY_MINUTES*SIXTY_SECONDS+days*SIXTY_SECONDS*SIXTY_MINUTES*TWO_FOUR_HOURS+seconds; //calculates the total # of seconds by adding and multiplying the variables and the constants

    System.out.println(); //creates whitespace
    
    total_days = total_seconds / (float) (TWO_FOUR_HOURS * SIXTY_MINUTES* SIXTY_SECONDS); //calculates the total number of days by dividing the total # of seconds by the 3 constants multiplied by eachother and while being converted to a float 
    
    DecimalFormat format = new DecimalFormat("0.00"); //2 place decimal formatting
   
    System.out.println("The total number of Second(s) is: " + total_seconds); //prints the total seconds
    System.out.println(); //white space
    System.out.print("The total number of Day(s) is " + format.format(total_days)); // prints the total days
    
    
    System.exit(0); //ends the program
    
    
    
    
    
    
    
    
    
  }
}