package Decorate;

/**
 * This is concrete component extends 1
 * Created by Sayarasin on 6/4/2016.
 */
public class ConcreteDecorateEx_1 extends AbstractDecorate{

    @Override
    public void dojob() {
        super.dojob();

        System.out.println("I am explicitly from Ex_1");
    }
}
