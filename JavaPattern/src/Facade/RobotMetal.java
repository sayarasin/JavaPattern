package Facade;

/**
 * This is robot metal
 * Created by Sayarasin on 6/11/2016.
 */
class RobotMetal {

    private String metal;
    void SetMetal(String metal)
    {
        this.metal=metal;
        System.out.println("Metal is set to : " + this.metal);
    }
}
