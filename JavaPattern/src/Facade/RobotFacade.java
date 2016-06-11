package Facade;

/**
 * This is robot facade
 * Created by Sayarasin on 6/11/2016.
 */
public class RobotFacade {

    private RobotBody  body;
    private RobotColor color;
    private RobotMetal metal;


    public RobotFacade() {
        body  = new RobotBody();
        color = new RobotColor();
        metal = new RobotMetal();
    }

    public void ConstructRobot(String color, String metal)
    {
        System.out.println("\nCreation of the Robot Start");
        this.color.SetColor(color);
        this.metal.SetMetal(metal);
        this.body.CreateBody();
        System.out.println(" \nRobot Creation End");
        System.out.println();
    }
}
