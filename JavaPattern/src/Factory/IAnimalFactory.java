package Factory;

/**
 * This is animal factory abstract class
 * Created by Sayarasin on 6/11/2016.
 */
public abstract class IAnimalFactory {

    /*if we cannot instantiate in later stage, we'll throw exception*/
    public abstract IAnimal GetAnimalType(String type) throws Exception;
}
