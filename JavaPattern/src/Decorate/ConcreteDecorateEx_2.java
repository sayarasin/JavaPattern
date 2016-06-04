package Decorate;

/**
 * This is concrete component extends 2
 * Created by Sayarasin on 6/4/2016.
 */
public class ConcreteDecorateEx_2 extends AbstractDecorate {

    @Override
    public void dojob() {
        super.dojob();

        System.out.println("I am explicitly from Ex_2");
    }
}
