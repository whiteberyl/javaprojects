import java.util.Scanner;
import java.util.Arrays;

public class DistinctValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // creates array that can store exactly 10 integers 
        int count = 0; //how many numbers has been sorted
       
        System.out.println("Enter Integers:");
    
        int number = 0;
        while (number != -1) {

            //string check
            if (!input.hasNextInt()) {
                System.out.println("Error, invalid input.");
                input.next(); 
                continue;
            }
            
            //double check
            if (!input.hasNextDouble()) {
                System.out.println("Error, invalid input.");
                input.next(); 
                continue;
            }

            number = input.nextInt(); //next int

            if (number == -1) {
                    break;
            }
            //duplicate check
            if (count < 10) {
                boolean isDuplicate = false; 
                for (int i = 0; i < count; i++) {
                    if (numbers[i] == number) {
                        isDuplicate = true;
                        break;
                    }
                }
                //adds non duplicates to array
                if (!isDuplicate) {
                    numbers[count] = number;
                    count++;
                }
            }
        }
        //sorts numerically
        Arrays.sort(numbers, 0, count);
        
        //output
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}