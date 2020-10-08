import java.util.Scanner;
/**
 * This program lets you know the interest rate over time
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user the starting vaule
    System.out.println("Please enter a starting balance");

    // Gets the number from the user
    double money = input.nextDouble();

    // Asks the user to type the interest rate
    System.out.println("Please enter your interest rate");
    
    // Gets the interest rate from the user
    double interest = input.nextDouble();

    interest = interest * 0.01;

    // Asks the user how many years they are going to invest for
    System.out.println("Please enter the number of years you will invest for");

    // Gets the year from the user
    double year = input.nextDouble();

    for(int i = 1; i <= year; i++){
      money = money + money * interest;
    }
    System.out.println("Your final balance would be $" + money);
  }
}
