import java.util.Scanner;

public class DivisibilityChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an integer: ");
int number = scanner.nextInt();
scanner.close();
checkDivisibility(number);
}
public static void checkDivisibility(int number) {
for (int divisor = 1; divisor <= 9; divisor++) {
if (number % divisor == 0) {
System.out.printf("The number %d is divisible by %d because it ends with %d.%n", number, divisor, divisor);
} else {
System.out.printf("The number %d is not divisible by %d.%n", number, divisor);
}
}
}
}

