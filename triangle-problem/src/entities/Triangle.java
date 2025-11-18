package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;

        // It is possible to return the function's value in two ways:
        // 1:
        //double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        //return  result;

        // 2:
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
