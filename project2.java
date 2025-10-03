import java.util.Scanner; 
import java.util.Random;

//Storage
public class project2 { 
   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random generator = new Random();
         
//Main Loop
int number = 0; //Make something like int num = 0 and like if num != 5 loop 
   while (number != 5) {       
// Menu
   System.out.println("Select an option:");  // i didnt want to use /n because it was too long
   System.out.println("1) Print a rectangle"); // width 7 height 5 
   System.out.println("2) Print a downwards right triangle"); //width && height = 6
   System.out.println("3) Print an upwards right triangle"); // width && height = 6
   System.out.println("4) Print a random rectangle"); // random rectangle  width 2-10 height 1-6
   System.out.println("5) Exit"); // exits  System.exit(0); "goodbye"
 
 //INPUT 
 System.out.println("Enter a number:");

if (input.hasNextInt()) {
    number = input.nextInt();   
} else {
    number = 0;                
    input.next();               
}
if (number < 1 || number > 5) {
    System.out.println("Error, invalid option, try again.\n");
} else {
   
//Calculation && Output
if (number == 1) {  //square 
      for (int i = 0; i < 5; i++) {        // height = 5 rows
         for (int j = 0; j < 7; j++) {     // width = 7 columns
             System.out.print("* ");
            }
      System.out.println();
      }
   }
 else if  (number == 2) {  // down tri
   for (int i = 0; i < 6; i++) {       //6x6
      for (int j = 0; j <= i; j++) {
         System.out.print("* ");
            }
      System.out.println();
      }
    }
   else if (number == 3) { // up tri
      for (int i = 5; i >= 0; i--) {      //6x6
         for (int j = 0; j <= i; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }  
   }
   else if (number == 4) {  //random
      int rwidth = generator.nextInt(9) + 2; //+2 because hits 0-1
      int rheight = generator.nextInt(6) + 1; // +1 because hits 0 
         for (int i = 0; i < rheight; i++) {       
            for (int j = 0; j < rwidth; j++) { 
                System.out.print("* ");
         }
         System.out.println();
      }
   }
   else if (number == 5) { //exit
      System.out.println("Goodbye.");
      System.exit(0);     
     }
     System.out.println(); //extra credit
        }
      }
   }
}
