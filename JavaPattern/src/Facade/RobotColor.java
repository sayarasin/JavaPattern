package Facade;

/**
 * This is robot color
 * Created by Sayarasin on 6/11/2016.
 */
class RobotColor {

    private String color;

    void SetColor(String color)
    {
        this.color = color;
        System.out.println("Color is set to : " + this.color);
    }
}
