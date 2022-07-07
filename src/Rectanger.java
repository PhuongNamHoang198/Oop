
import java.util.Scanner;

public class Rectanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectanger rectangle = new Rectanger(width, height);
//        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    double width, height;
    public Rectanger() {

    }
    public Rectanger(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public  double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width +this.height) *2;

    }
//    public String display() {
//        return "rectangle" +"width=" + width + ", height=" +height ;
//    }

}

