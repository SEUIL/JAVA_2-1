package week05.quiz6_2_007;

public class quiz6_3_007 {
    //2133007
    //황스일
    public static void main(String[] args) {
        Phone[] phones = {new Phone("황진이") , new Telephone("길동이","내일"
        ), new Smartphone("민국이","갤러그")};

        for (Phone phone : phones) {
            if (phone instanceof Smartphone) {
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone) {
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
        System.out.println(owner+ "가 통화 중이다.");
    }
}
class Telephone extends Phone{
    private String when;
    Telephone(String owner, String when){
        super(owner);
        this.when = when;
    }
    void autoAnswering(){
        System.out.println(owner+ "가 없다. "+when+ " 전화 줄래.");
    }
}
class Smartphone extends Phone{
    private String game;
    Smartphone(String owner, String game){
        super(owner);
        this.game = game;
    }
    void playGame(){
        System.out.println(owner+"가 " +game+" 게임을 하는 중이다.");
    }
}

