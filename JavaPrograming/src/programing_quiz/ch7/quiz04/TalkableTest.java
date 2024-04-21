package easyjava.programing_quiz.ch7.quiz04;


public class TalkableTest {
    static void speak(Talkable k){
        k.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}

interface Talkable {
    void talk();
}

class American implements Talkable{
    @Override
    public void talk() {
        System.out.println("Hello!");
    }
}

class Korean implements Talkable{
    @Override
    public void talk() {
        System.out.println("안녕하세요!");
    }
}