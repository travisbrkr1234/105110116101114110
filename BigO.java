import java.util.Scanner;

public class BigO {

  public static void main(String[] args) {
    double n, s;
    System.out.println("Please enter a number to find the growth rate: ");
    Scanner input = new Scanner(System.in);
    n = input.nextDouble();
    s = n * (n+1) / 2;
    System.out.println("The sum of n = : " + s);
  }
}
