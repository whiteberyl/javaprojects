
import java.util.Scanner; 

public class Project3 { 
   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);         

         //Input 1 grab string from command line or user 
         String linesText;
         if (args.length == 0) {
            System.out.println("Enter the number of lines to type:");
            linesText = input.nextLine();
         } else { 
            linesText = args[0];  
         }  

         //Input 2 int check
         Scanner textScanner = new Scanner(linesText); 
         if (!textScanner.hasNextInt()) { // data type check
            System.out.println("Error: Non-integer input.");
            System.exit(0);
         }

         int lines = textScanner.nextInt();
         if (lines < 1 || lines > 5) {
            System.out.println("Error: Invalid integer number.");
            System.exit(0);
         }

         //Input 3 2D array it up!
         String[][] paragraph = new String[lines][];
         for (int i = 0; i < paragraph.length; i++) {
            System.out.println("Line " + i + ":");
            String sentence = input.nextLine();
            String[] words = sentence.split("\\s");
            paragraph[i] = words;            
         }

         //Calculation 1 inflate  //string.format %-10s
         for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
               paragraph[i][j] = String.format("%-10s", paragraph[i][j]);
            }
         }
          
         //Calculation 2 chop chop chop
         for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
                  paragraph[i][j] = paragraph[i][j].substring(0, 10);
            }
         }
         
         //Calculation 3 alphabetical rearrangement; triple for loop
         for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length - 1; j++) {
               for (int k = j + 1; k < paragraph[i].length; k++) {
                  if (paragraph[i][j].compareToIgnoreCase(paragraph[i][k]) > 0) {
                     String temporary = paragraph[i][j];
                     paragraph[i][j] = paragraph[i][k];
                     paragraph[i][k] = temporary;
                  }
               }
            }
         }

         //Output :P
         for (int i = 0; i < paragraph.length; i++) {
            for (int j = 0; j < paragraph[i].length; j++) {
               System.out.print(paragraph[i][j] + "/");
            }
            System.out.println();
         }
   }
}
