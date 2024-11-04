
// public class Main {
//   public static void main(String[] args) {
//     // Scanner scanner = new Scanner(System.in);
//     // System.out.print("Enter an integer greater than 5: ");
//     // int userNumber = scanner.nextInt();
    
//     // while(userNumber <= 5) {
//     //     System.out.print("Try again: ");
//     //     userNumber = scanner.nextInt();

//     // }

//     // for (int i = 0; i < userNumber; i ++) {
//     //     System.out.println(i);

//     // }

//     // System.out.println("and finally " + userNumber);

//     int dice1 = 0;
//     int dice2 = 0;
//     int numberRoll = 0;
//     while (dice1 != dice2 || dice1 != 1) {
//         numberRoll ++;
//         dice1 = (int)(Math.random() * 6 + 1);
//         dice2 = (int)(Math.random() * 6 + 1);
//         System.out.println("Roll #" + numberRoll + ": " + dice1 + " and " + dice2);

//         if(dice1 != dice2 || dice1 != 1) {
//             System.out.println("Not snake eyes, roll again!");

//         }

//     }       
//      System.out.println("Finally, snake eyes");
//   }
// }
// package U4T1_Lab2;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("What number do you want to halve to one? ");
//       int userNumber = scanner.nextInt();
//       int halfTime = 0;
//       int newNum = userNumber;
//       while (newNum > 1) {
//         newNum /= 2;
//         halfTime ++;
//         System.out.println(newNum);
        
//       }

//       System.out.println("it takes " + halfTime +" halvings to get from " + userNumber + " to 1.");
//     }
//   }
  
// package U4T1_Lab2;
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("What number do you want to factorial? ");
//     System.out.print("Enter a number between 0 and 170: ");
//     int userNumber = scanner.nextInt();
//     int calcNumber;
//     double newNum = 1;
//     while(userNumber > 170 || userNumber < 0) {
//       System.out.print("No! Between 0 and 170");
//       userNumber = scanner.nextInt();

//     }
//     calcNumber = userNumber;

//     while(calcNumber >= 1) {
//       newNum *= calcNumber;
//       calcNumber --;

//     }
//     System.out.println(userNumber + "! is " + newNum);
//   }
// }

package U4T1_Lab2;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number that is either positive, even, and a multiple of 7 OR prime:");
    int userNumber = scanner.nextInt();
    boolean conditionMet = false;
    while(!conditionMet && !isPrime(userNumber)) {
      if(userNumber >= 0) {
        if(userNumber % 2 == 0) {
          if(userNumber % 7 == 0) {
            System.out.println("Well done, " + userNumber + " is a positive, even, multiple of 7!");
            conditionMet = true;

          }
          else {
            System.out.println("Not a multiple of 7");
            System.out.print("Try again: ");
            userNumber = scanner.nextInt();

          }

        }
        else {
          System.out.println("Not even");
          if(userNumber % 7 != 0) {
            System.out.println("Not a multiple of 7");

          }
          System.out.print("Try again: ");
          userNumber = scanner.nextInt();

        }

      } 
      else{
        System.out.println("Not positive");
        if(userNumber % 2 != 0) {
          System.out.println("Not even");

        }
        if(userNumber % 7 != 0) {
          System.out.println("Not a multiple of 7");
        }

        System.out.print("Try again: ");
        userNumber = scanner.nextInt();

      }

    }
    if(isPrime(userNumber)) {
      System.out.println("Well done, " + userNumber + " is prime!");
      
    }

  }

  /* Returns true if number is prime and false
        if it is not prime; if number is 1, return false */
  private static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }

    int currentDivisor = 2; //start at 2 since no need to check 1

    while (currentDivisor < number) {
      if (number % currentDivisor == 0) {
        return false;  // breaks the loop AND exits the method
      }
      currentDivisor++;
    }
    return true;
  }


}

