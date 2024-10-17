import java.util.Scanner;

public Class SemesterMarksAverage {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 // Initialize variables to store marks and total
 double totalMarks = 0.0;
 int numUnits = 5;
// Prompt the user to enter marks for each unit
for (int i = 1; i <= numUnits; i++) {
System.out.print("Enter marks for unit " + i + ": ");
double marks = scanner.nextDouble();
totalMarks += marks;
}
// Calculate the average
double average = totalMarks / numUnits;
// Display the average with two decimal places
System.out.printf("Average marks: %.2f%n", average);
// Close the scanner
scanner.close();
}
}


