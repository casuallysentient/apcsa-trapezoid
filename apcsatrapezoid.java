import java.util.Scanner;

public class apcsatrapezoid {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter the trapezoid's top length: ");
    double top = in.nextDouble();
    System.out.print("Enter the trapezoid's bottom length: ");
    double bottom = in.nextDouble();
    System.out.print("Enter the trapezoid's height: ");
    double height = in.nextDouble();

    double area = ((top + bottom) / 2) * height;

    System.out.printf("\nThe area of the trapezoid is %,.1f.\n", area);

    in.close();
  }
}
