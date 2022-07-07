public class QuandraticEquation {
    private double a,b,c;
    public QuandraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getValue(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        double delta = b*b -4*a*c;
        return delta;
    }
    public double getRoot1(double delta) {
        double root1 = ((-b) + Math.pow(delta, 0.5)) / (2 * a);
        return root1;
    }
    public double getRoot2(double delta) {
        double root2 = ((-b) - Math.pow(delta, 0.5)) / (2 * a);
        return root2;
    }
}
