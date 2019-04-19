package za.ac.cputweek;

public class SadState implements EmotionState {
    @Override
    public String sayHello() {
        return "Hello. sniff, sniff .";
    }

    @Override
    public String sayGoodbye() {
        return "Bye, sniff, sniff";
    }
}
