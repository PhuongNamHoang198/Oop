import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        QuandraticEquation quandraticEquation = new QuandraticEquation(a, b, c);

        double delta = quandraticEquation.getDiscriminant();
        double root1 = quandraticEquation.getRoot1(delta);
        double root2 = quandraticEquation.getRoot2(delta);

        if(delta >= 0){
            System.out.println("The two solutions of the equation are: " + root1 + ", " + root2);
        }else if(delta == 0){
            System.out.println("The two solutions of the equal equation are: " + root1);
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
