import java.util.Scanner;

public class Hui {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);




            System.out.println("Calculate an area of a rectangle or circle (r/c)?\nx to exit");

            String choice = sc.nextLine();

            if (choice.equals("r")) {

                System.out.println("Width?");

                double width = Double.parseDouble(sc.nextLine());

                System.out.println("Length?");

                double length = Double.parseDouble(sc.nextLine());

                double res = Calculation.calcArea(width, length);

                System.out.println(res);

                System.out.printf("Formatted: %.2f \n", res);

            }

            else if (choice.equals("c")) {

                System.out.println("Radius?");

                double r = Double.parseDouble(sc.nextLine());

                double res = Calculation.calcArea(r);

                System.out.println(res);

                System.out.printf("Formatted output: %.2f \n", res);

            }

            

            else

                System.out.println("Unknown choice. Please try again.");

        }

    }
	



