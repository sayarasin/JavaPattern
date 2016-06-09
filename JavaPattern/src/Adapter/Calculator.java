package Adapter;

/**
 * This calculator is calculate area of rectangle
 * Created by Sayarasin on 6/9/2016.
 */
class Calculator {

    private Rect rectangle;

    double getArea(Rect rect) {
        rectangle = rect;
        return rect.l * rect.w;
    }
}

