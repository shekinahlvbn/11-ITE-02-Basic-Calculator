import java.util.Scanner;

public class Shekinah {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
      String name;
   
      System.out.print("Please enter your name: ");
      name = scanner.nextLine();
   
      do {
         System.out.println("Welcome, " + name + "!");
      
         int operationChoice;
         
         do {
            System.out.println("Please choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
         
            System.out.print("Select an operation (1-4): ");
            
            while (!scanner.hasNextInt()) {
               System.out.println("Invalid input. Please enter a number.");
               scanner.next();
            }
            operationChoice = scanner.nextInt();
            scanner.nextLine();
         
            
            if (operationChoice < 1 || operationChoice > 4) {
               System.out.println("Invalid choice. Please choose a number between 1 and 4.");
            }
         } while (operationChoice < 1 || operationChoice > 4);
      
         String operation;
      
         switch (operationChoice) {
            case 1:
               operation = "Addition";
               break;
            case 2:
               operation = "Subtraction";
               break;
            case 3:
               operation = "Multiplication";
               break;
            case 4:
               operation = "Division";
               break;
            default:
               operation = "Unknown";
         }
      
         System.out.println("Hello, " + name + "! You have chosen " + operation + ".");
         System.out.print("How many numbers do you want to perform the operation with? ");
      
         
         int numberOfNumbers;
         while (true) {
            if (scanner.hasNextInt()) {
               numberOfNumbers = scanner.nextInt();
               scanner.nextLine();
               break;
            } else {
               System.out.println("Invalid input. Please enter a valid number.");
               scanner.next();
            }
         }
      
         double result = 0;
         
         for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.print("Enter number " + i + ": ");
            double currentNumber;
           
            while (true) {
               if (scanner.hasNextDouble()) {
                  currentNumber = scanner.nextDouble();
                  scanner.nextLine();
                  break;
               } else {
                  System.out.println("Invalid input. Please enter a valid number.");
                  scanner.next();
               }
            }
         
            
            switch (operationChoice) {
               case 1:
                  result += currentNumber;
                  break;
               case 2:
                  if (i == 1) {
                     result = currentNumber;
                  } else {
                     result -= currentNumber;
                  }
                  break;
               case 3:
                  if (i == 1) {
                     result = currentNumber;
                  } else {
                     result *= currentNumber;
                  }
                  break;
               case 4:
                  if (i == 1) {
                     result = currentNumber;
                  } else {
                     result /= currentNumber;
                  }
                  break;
            }
         }
      
         System.out.println("The answer is: " + result);
      
         System.out.print("Do you want to perform another operation? (yes/no): ");
         String answer;
         
         while (true) {
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes") || answer.equals("no")) {
               break;
            } else {
               System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
         }
      
         if (answer.equals("no")) {
            System.out.println("Goodbye, " + name + "!");
            break;
         }
      
      } while (true);
   
      scanner.close();
   }
}
