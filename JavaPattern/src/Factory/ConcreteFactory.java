package Factory;

/**
 * This is concrete factory
 * Created by Sayarasin on 6/11/2016.
 */
public class ConcreteFactory extends IAnimalFactory {

    @Override
    public IAnimal GetAnimalType(String type) throws Exception
    {
        switch (type)
        {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception( "Animal type : "+ type+ " cannot be instantiated");
        }
    }

}
