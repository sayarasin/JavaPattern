package Adapter;

/**
 * This class adapter rect calculator to compute area of triangle
 * Created by Sayarasin on 6/9/2016.
 */
public class CalculatorAdapter {
    private Calculator calc;
    private Triangle triangle;

    public double getArea(Triangle triangle) {
        calc = new Calculator();
        this.triangle = triangle;
        Rect rect = new Rect(triangle.b, triangle.h * 0.5);
        return calc.getArea(rect);
    }
}
