package Factory;

/**
 * This is duck
 * Created by Sayarasin on 6/11/2016.
 */
class Duck implements IAnimal {

    @Override
    public void Speak()
    {
        System.out.println("Duck says Pack-pack");
    }
}
