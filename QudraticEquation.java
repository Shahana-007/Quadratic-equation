import java.util.Scanner;
class QuadraticEquation {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
if (a == 0) {
System.out.println("The value of 'a' cannot be 0");
}
else 
{
double discriminant = b * b - 4 * a * c;
if (discriminant > 0) {
double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.println("The roots are real and distinct:");
System.out.println("Root 1: " + root1);
System.out.println("Root 2: " + root2);
}
else if (discriminant == 0) {
double root = -b / (2 * a);
System.out.println("The roots are real and equal:");
System.out.println("Root: " + root);
}
else {
double real = -b / (2 * a);
double imaginary = Math.sqrt(-discriminant) / (2 * a);
System.out.println("The roots are complex and imaginary:");
System.out.println("Root 1: " + real + " + " + imaginary + "i");
System.out.println("Root 2: " + real + " - " + imaginary + "i");
}
}
sc.close();
}
}
