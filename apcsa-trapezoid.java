import java.util.Scanner;

public class apcsa-trapezoid {
  public static void main(String[] args) {
    System.out.print("Enter the trapezoid's top length: ");
    double top = in.nextDouble();
    System.out.print("Enter the trapezoid's bottom length: ");
    double bottom = in.nextDouble();
    System.out.print("Enter the trapezoid's height: ");
    double height = in.nextDouble();

    double area = ((top + bottom) / 2) * height;

    System.out.printf("The area of the trapezoid is %,.1f.", area);

    in.close();
  }
}
