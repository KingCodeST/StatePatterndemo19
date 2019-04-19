package za.ac.cputweek;

public class HappyState implements EmotionState {
    @Override
    public String sayHello() {
        return "Hello, Friend!";
    }

    @Override
    public String sayGoodbye() {
        return "Bye, Friend!";
    }
}
