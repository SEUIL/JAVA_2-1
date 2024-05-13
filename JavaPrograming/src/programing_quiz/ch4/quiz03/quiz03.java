package easyjava.programing_quiz.ch4.quiz03;

// 테스트를 위한 메인 클래스
public class quiz03 {
    public static void main(String[] args) {
        // Member 객체 생성 및 초기화
        Member member = new Member("스일","SEUIL",123,23);

        // Member 객체의 정보 출력
        System.out.println(member.getAge() + member.getId() + member.getName() + member.getPw());
    };
}

// 회원 정보를 저장하는 클래스
class Member{
    // 회원의 이름, 아이디, 비밀번호, 나이를 저장할 변수
    private String name;
    private String id;
    private int pw;
    private int age;

    // 회원 정보를 설정하는 메서드
    void setMember(String name, String id, int pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    // 생성자: 회원 정보를 초기화
    public Member(String name, String id, int pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    // 회원의 이름을 반환하는 메서드
    String getName(){
        return name;
    }

    // 회원의 아이디를 반환하는 메서드
    String getId(){
        return id;
    }

    // 회원의 비밀번호를 반환하는 메서드
    int getPw(){
        return pw;
    }

    // 회원의 나이를 반환하는 메서드
    int getAge(){
        return age;
    }
}
