import java.util.Scanner;
public class SmallestNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
		if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest.");
        } else {
            System.out.println(num1 + " is not the smallest.");
        }
        scanner.close();
    }
}