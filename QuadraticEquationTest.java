import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double number_a = scanner.nextDouble();
        System.out.println("Input b: ");
        double number_b = scanner.nextDouble();
        System.out.println("Input c: ");
        double number_c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(number_a, number_b, number_c);
        System.out.println(quadraticEquation.getInfomation());
        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();
        if (delta > 0) {
            System.out.println("The equation has two roots:" + root1+ "\t and "+root2);
        } else if (delta == 0) {
            System.out.println("QuadraticEquation has one result: " + root1);
        } else {
            System.out.println("The equation has no roots");
        }
    }


}
