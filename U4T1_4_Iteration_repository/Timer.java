package U4T1_4_Iteration_repository;
import java.util.Scanner;

public class Timer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What number do you want to count up to? ");
    int countTo = scanner.nextInt();
    
    int counter = 1;
    while (counter - 1 < countTo) {
      System.out.println(counter);
      counter++;
    }
  }
}

