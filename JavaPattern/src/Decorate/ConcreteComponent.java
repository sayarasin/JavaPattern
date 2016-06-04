package Decorate;

/**
 * This is concrete component implement
 * Created by Sayarasin on 6/4/2016.
 */
public class ConcreteComponent extends Component{

    @Override
    public void dojob() {
        System.out.println(" I am from Concrete Component-I am closed "
                + "for modification.");
    }
}
