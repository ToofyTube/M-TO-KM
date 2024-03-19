import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    float km = 0;
    System.out.println("Enter Miles");
    Scanner input = new Scanner(System.in);
    double miles = input.nextDouble();
    km = (float) (miles * 1.609);
    System.out.println(miles + " Miles = " + km + " Kilometers");
  }
}