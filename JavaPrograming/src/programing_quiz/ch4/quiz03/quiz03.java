package easyjava.programing_quiz.ch4.quiz03;

public class quiz03 {
    public static void main(String[] args) {
        Member member = new Member("스일","SEUIL",123,23);
        System.out.println(member.getAge() + member.getId() + member.getName() + member.getPw());
    };
}
class Member{
    private String name;
    private String id;
    private int pw;
    private int age;
    void setMember(String name, String id, int pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
    public Member(String name, String id, int pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }
    String getName(){
        return name;
    }
    String getId(){
        return id;
    }
    int getPw(){
        return pw;
    }
    int getAge(){
        return age;
    }
}

