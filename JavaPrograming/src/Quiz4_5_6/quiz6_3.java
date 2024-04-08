package easyjava.Quiz4_5_6;

public class quiz6_3 {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("황진이"),
                new Telephone("길동이", "내일"),
                new Smartphone("민국이","갤러그")};

        for (Phone phone : phones) {
            if (phone instanceof Smartphone){
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone)phone).autoAnsering();
            } else if (phone instanceof Phone){
                phone.talk();
            }
        }
    }
}

class Phone{
    protected String owner;
    Phone(String owner){
        this.owner = owner;
    }
    void talk(){
        System.out.println(owner+"는 통화 중이다.");
    }
}

class Telephone extends Phone{
    private String when;
    Telephone(String owner,String when) {
        super(owner);
        this.when = when;
    }
    void autoAnsering(){
        System.out.println(owner+"가 없다. "+when+" 전화 줄래.");
    }
}

class Smartphone extends Phone{
    private String game;
    Smartphone(String owner, String game) {
        super(owner);
        this.game = game;
    }
    void playGame(){
        System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");
    }
}
