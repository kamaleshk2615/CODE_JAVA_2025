import java.util.Scanner;
class Divisiblefive{
	public static void main(String arg[]){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number%5 == 0){
			System.out.println("is the number +number+ divisible by 5? YES");
		}
		else{
			System.out.println("is the number +number+ divisible by 5? NO");
		}
		input.close();
	}
}		