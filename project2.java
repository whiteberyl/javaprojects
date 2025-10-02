import java.util.Scanner; 
import java.util.Random;

//Storage
public class project2 { 
   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random generator = new Random();
         
//Make something like int num = 0 and like if num != 5 loop 

int number = 0;
   while (number != 5) {       
// Menu
   System.out.println("Select an option:"); 
   System.out.println("1) Print a rectangle"); // width 7 height 5 
   System.out.println("2) Print a downwards right triangle"); //width && height = 6
   System.out.println("3) Print an upwards right triangle"); // width && height = 6
   System.out.println("4) Print a random rectangle"); // random rectangle  width 2-10 height 1-6
   System.out.println("5) Exit"); // exits  System.exit(0); "goodbye"
   
 //INPUT intiger
   System.out.println("Enter a number:");
   if (!input.hasNextInt()) { //data type check
      System.out.println("Error, invalid option, try again.");
      continue;
   }     

   number = input.nextInt();
   input.nextLine(); // input flushing

   if (number < 1 || number > 5) { //if valid input checking
      System.out.println("Error, invalid option, try again.");
      System.out.println();
      continue;
   }  
   
//Calculation
//Square
if (number == 1) {  
      for (int i = 0; i < 5; i++) {        // height = 5 rows
         for (int j = 0; j < 7; j++) {     // width = 7 columns
             System.out.print("* ");
   }
      System.out.println();
   }
   }
 //down triangle 6 
 if (number == 2) {  
   for (int i = 0; i < 6; i++) {
      for (int j = 0; j <= i; j++) {
         System.out.print("* ");
   }
      System.out.println();
   }
   
   }
//Up triangle 6
if (number == 3) {
   for (int i = 5; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
         System.out.print("* ");
   }
      System.out.println();
   }
   
   }
int rwidth = generator.nextInt(11); // keep rerolling
int rheight = generator.nextInt(7);

if (number == 4) {  
   while (rwidth < 2); {
      rwidth = generator.nextInt(11);
   }
   while (rheight == 0); {
      rheight = generator.nextInt(7);
   }
      

      for (int i = 0; i < rheight; i++) {       
         for (int j = 0; j < rwidth; j++) { 
             System.out.print("* ");
   }
         System.out.println();
   }
   }
if (number == 5) {
   System.out.println("Goodbye.");
   System.exit(0);     
  }
  }
  }
  }
 
//Output
