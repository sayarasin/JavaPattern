import Adapter.CalculatorAdapter;
import Adapter.Triangle;
import Command.Invoke;
import Command.MyRedoCommand;
import Command.MyUndoCommand;
import Command.Receiver;
import Decorate.ConcreteComponent;
import Decorate.ConcreteDecorateEx_1;
import Facade.RobotFacade;
import Factory.ConcreteFactory;
import Factory.IAnimal;
import Factory.IAnimalFactory;
import Iterator.Arts;
import Iterator.IIterator;
import Iterator.ISubject;
import Iterator.Science;
import Observer.Observer;
import Observer.Subject;
import Singleton.*;
import Proxy.*;
import Strategy.Context;
import Strategy.FirstChoice;
import TemplateMethod.ComputerScience;
import TemplateMethod.Electronics;



/**
 * This is the main
 * Created by Sayarasin on 6/4/2016.
 */
public class Main {

    private static Subject subject = new Subject();

    public static void main(String [] args) {

        // Observer
        System.out.println("\n\n***Observer Pattern Demo***\n");
        Observer observer1 = new Observer();
        subject.register(observer1);
        subject.setValue(10);
        subject.setValue(20);
        subject.unregister(observer1);
        subject.setValue(30);

        //Singleton
        System.out.println("\n\n***Singleton Pattern Demo***\n");
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.getValue());
        singleton.setValue(20);
        System.out.println(singleton.getValue());
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2.getValue());

        SingletonEx singletonEx = SingletonEx.getSingletonEx();
        System.out.println(singleton.getValue());
        singletonEx.setValue(20);
        System.out.println(singletonEx.getValue());
        SingletonEx singletonEx2 = SingletonEx.getSingletonEx();
        System.out.println(singletonEx2.getValue());


        // Proxy
        System.out.println("\n\n***Proxy Pattern Demo***\n");
        Proxy proxy = new Proxy();
        proxy.doSomework();


        // Decorate
        System.out.println("\n\n***Decorate Pattern Demo***\n");
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorateEx_1 decorateEx_1 = new ConcreteDecorateEx_1();
        decorateEx_1.dojob();
        decorateEx_1.setComponent(component);
        decorateEx_1.dojob();


        // Template method
        System.out.println("\n\n***Template Pattern Demo***\n");
        new ComputerScience().papers();
        new Electronics().papers();


        // Strategy
        System.out.println("\n\n***Strategy Pattern Demo***\n");
        FirstChoice c1 = new FirstChoice();
        Context context = new Context(c1);
        context.ShowChoice("2", "1");


        // Adapter
        System.out.println("\n\n***Adapter Pattern Demo***\n");
        CalculatorAdapter cal=new CalculatorAdapter();
        Triangle t = new Triangle(20,10);
        System.out.println("Area of Triangle is :" + cal.getArea(t));

        // Command
        System.out.println("\n\n***Command Pattern Demo***\n");
        Receiver intended_receiver = new Receiver();
        /*Client holds Invoker and Command Objects*/
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intended_receiver);
        MyRedoCommand reCmd = new MyRedoCommand(intended_receiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);

        // Iterator
        System.out.println("\n\n***Iterator Pattern Demo***\n");
        ISubject Sc_subject = new Science();
        ISubject Ar_subjects = new Arts();
        IIterator Sc_iterator = Sc_subject.CreateIterator();
        IIterator Ar_iterator = Ar_subjects.CreateIterator();
        System.out.println("\nScience subjects :");
        while(!Sc_iterator.IsDone()) {
            System.out.println(Sc_iterator.Next());
        }
        System.out.println("\nArts subjects :");
        while(!Ar_iterator.IsDone()) {
            System.out.println(Ar_iterator.Next());
        }

        // Facade
        System.out.println("\n\n***Facade Pattern Demo***");
        RobotFacade facade1 = new RobotFacade();
        facade1.ConstructRobot("Green", "Copper");
        RobotFacade facade2 = new RobotFacade();
        facade2.ConstructRobot("Red", "iron");

        // Factory
        System.out.println("\n\n***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        try {
            IAnimal DuckType = animalFactory.GetAnimalType("Duck");
            DuckType.Speak();
            IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
            TigerType.Speak();
            //There is no Lion type. So, an exception will be thrown
            IAnimal LionType = animalFactory.GetAnimalType("Lion");
            LionType.Speak();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
