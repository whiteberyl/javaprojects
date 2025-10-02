import java.util.Scanner; 
public class project1v1 { 
   public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

                  //INPUT NAME
         System.out.println("Enter your name"); 
         String name = input.nextLine();
         if (name.isEmpty()) { //empty name check
            System.out.println("Error: Invalid string.");
            System.exit(0);                 
         }
        //INPUT intiger
         System.out.println("Enter an intiger number between 10 to 30:");
         if (!input.hasNextInt()) { //data type check
            System.out.println("Error, invalid input.");
            System.exit(0);
         }     
            int number = input.nextInt();
            input.nextLine(); // input flushing
         if (number < 10 || number > 30) { //if valid input checking
            System.out.println("Error, invalid interger number.");
            System.exit(0);
         }
         //INPUT FLOATING POINT
         System.out.println("Enter an floating point number between 0.44 to 0.66:");
         if (!input.hasNextDouble()) { //data type check double
            System.out.println("Error, non floating point input.");
            System.exit(0);
         }     
            Double fraction = input.nextDouble();
            input.nextLine(); // input flushing
         if (fraction < 0.44 || fraction > 0.66) { //valid input checking
               System.out.println("Error, invalid floating point number.");
               System.exit(0);
         }
         //Calculations
          int constant = 2;
          
            //30 
         if (number == 30){
            if (fraction > 0.55) { 
            Double result = ((number + constant) * fraction);
            System.out.println(name + ", your result is " + result); 
         } 
               else { 
               Double result = ((number + constant) / fraction);
               System.out.println(name + ", your result is " + result); 
            }
         }
            //Subtration
         else if (number >= 25 && number <= 29) {
            if (fraction > 0.55) {
            Double result = ((number - constant) * fraction);
            System.out.println(name + " your result is " + result); 
         }
               else { 
               Double result = ((number - constant) / fraction);
               System.out.println(name + ", your result is " + result);
            }
         }
          //Division
         else if (number >= 20 && number <= 24) {
            if (fraction > 0.55) {
            Double result = ((number / constant) * fraction);
            System.out.println(name + " your result is " + result); 
         }
               else {
            Double result = ((number / constant) / fraction);
               System.out.println(name + " your result is " + result);
            }
         }

            //Modulo 
         else if (number >= 10 && number <= 19) {
            if (fraction > 0.55) {
            Double result = ((number % constant) * fraction);
            System.out.println(name + " your result is " + result); 
         }
               else {
               Double result = ((number % constant) / fraction);
               System.out.println(name + " your result is " + result); 
            }
         }   
         
         //EC
        if (name.equalsIgnoreCase("bob")) {
            System.out.println("How cool, my grandpa’s name is also " + name);
        }
//compiled = awesomesauce 2025                                           
                }
}
