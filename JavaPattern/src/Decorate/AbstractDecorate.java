package Decorate;

/**
 * This is abstract decorate
 * Created by Sayarasin on 6/4/2016.
 */
public class AbstractDecorate extends Component {

    private Component com = null;


    public void setComponent(Component com) {
        this.com = com;
    }

    @Override
    public void dojob() {
        if(com != null)
            com.dojob();
    }
}
