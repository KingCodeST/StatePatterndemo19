package za.ac.cputweek;

public class MainDriver {

    public  static void main(String[] args)
    {

        Person person=new Person(new HappyState());

        System.out.println("Hello in happy state: "+person.sayHello());
        System.out.println("GoodBye in happy state: "+person.sayGoodbye());

        person.setEmotionState(new SadState());
        System.out.println("Hello in happy state: "+person.sayHello());
        System.out.println("GoodBye in happy state: "+person.sayGoodbye());



    }

}
