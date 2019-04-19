package za.ac.cputweek;

public class Person implements EmotionState {

    EmotionState emotionState;

    public Person(EmotionState emotionState) {
        this.emotionState = emotionState;
    }

    public void setEmotionState(EmotionState emotionState) {
        this.emotionState = emotionState;
    }

    @Override
    public String sayHello() {
        return emotionState.sayHello();
    }

    @Override
    public String sayGoodbye() {
        return emotionState.sayGoodbye();
    }
}
