import java.util.Scanner;
public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
		if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the largest.");
        } else {
            System.out.println("There is no single largest number.");
        }
        scanner.close();
    }
}
